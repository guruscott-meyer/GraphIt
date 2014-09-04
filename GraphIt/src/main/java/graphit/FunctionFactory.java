/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import graphpanel.*;
import java.util.ArrayList;
import java.lang.Math;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */

@Component
public class FunctionFactory {
    
    public static FunctionFramework Linear( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ), 
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
                new FunctionFramework( (a,b) -> a, (a,b) -> "x" )
            ),
            new FunctionFramework( parameters.get(1), (a,b) -> "b")
        );
    }
    
    public static FunctionFramework Quadratic( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                new FunctionFramework( parameters.get(0), (a,b) -> "a"),
                new TwoArgumentFunctionFramework( (a,b) -> Math.pow( a, b ), (a,b) -> String.format( "%s<sup>%s</sup>", a, b),
                    new FunctionFramework( (a,b) -> a, (a,b) -> "x"),
                    new FunctionFramework( (a,b) -> 2, (a,b) -> "2")
                )
            ),
            new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ), 
                    new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                        new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                        new FunctionFramework( (a,b) -> a, (a,b) -> "x" )
                    ),
                    new FunctionFramework( parameters.get(2), (a,b) -> "c")
            )
        );
    }
    
    public static FunctionFramework Cubic( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                new FunctionFramework( parameters.get(0), (a,b) -> "a"),
                new TwoArgumentFunctionFramework( (a,b) -> Math.pow( a, b ), (a,b) -> String.format("%s<sup>%s</sup>", a, b),
                    new FunctionFramework( (a,b) -> a, (a,b) -> "x"),
                    new FunctionFramework( (a,b) -> 3, (a,b) -> "3")
                )
            ),
            new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                    new FunctionFramework( parameters.get(1), (a,b) -> "b"),
                    new TwoArgumentFunctionFramework( (a,b) -> Math.pow( a, b ), (a,b) -> String.format("%s<sup>%s</sup>", a, b),
                        new FunctionFramework( (a,b) -> a, (a,b) -> "x"),
                        new FunctionFramework( (a,b) -> 2, (a,b) -> "2")
                    )
                ),
                new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ), 
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x" )
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d")
                )
            )
        );
    }
    
    public static FunctionFramework Quartic( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                new FunctionFramework( parameters.get(0), (a,b) -> "a"),
                new TwoArgumentFunctionFramework( (a,b) -> Math.pow( a, b ), (a,b) -> String.format("%s<sup>%s</sup>", a, b),
                    new FunctionFramework( (a,b) -> a, (a,b) -> "x"),
                    new FunctionFramework( (a,b) -> 4, (a,b) -> "4")
                )
            ),
            new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                    new FunctionFramework( parameters.get(1), (a,b) -> "b"),
                    new TwoArgumentFunctionFramework( (a,b) -> Math.pow( a, b ), (a,b) -> String.format("%s<sup>%s</sup>", a, b),
                        new FunctionFramework( (a,b) -> a, (a,b) -> "x"),
                        new FunctionFramework( (a,b) -> 3, (a,b) -> "3")
                    )
                ),
                new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                    new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                        new FunctionFramework( parameters.get(2), (a,b) -> "c"),
                        new TwoArgumentFunctionFramework( (a,b) -> Math.pow( a, b ), (a,b) -> String.format("%s<sup>%s</sup>", a, b),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x"),
                            new FunctionFramework( (a,b) -> 2, (a,b) -> "2")
                        )
                    ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ), 
                            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                                new FunctionFramework( parameters.get(3), (a,b) -> "d" ),
                                new FunctionFramework( (a,b) -> a, (a,b) -> "x" )),
                            new FunctionFramework( parameters.get(4), (a,b) -> "e")
                    )
                )
            )
        );
    }
    
    public static FunctionFramework LnX( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ), 
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                new FunctionFramework( parameters.get(0), (a,b) -> "a"),
                new OneArgumentFunctionFramework( (a,b) -> Math.log(a), (a,b) -> "ln" + a,
                    new FunctionFramework( (a,b) -> a, (a,b) -> "x" )
                )
            ),
            new FunctionFramework( parameters.get(1), (a,b) -> "b" )
        );
    }
    
    public static FunctionFramework PowerofE( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new OneArgumentFunctionFramework( (a,b) -> Math.exp( a ), (a,b) -> String.format( "e<sup>%s</sup>", a ),
                new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                    new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                    new FunctionFramework( (a,b) -> a, (a,b) -> "x" )
                )
            )
        );
    }
    
    public static FunctionFramework PowerofX( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> Math.pow(a, b), (a,b) -> String.format("%s<sup>%s</sup>", a, b),
                new FunctionFramework( (a,b) -> a, (a,b) -> "x" ),
                new FunctionFramework( parameters.get(1), (a,b) -> "b" )
            )
        );
    }
    
    public static FunctionFramework X2( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
            new FunctionFramework( parameters.get(0), (a,b) -> "a"),
            new TwoArgumentFunctionFramework( (a,b) -> Math.pow(a,b), (a,b) -> String.format("%s<sup>%s</sup>", a, b),
                new FunctionFramework( (a,b) -> a, (a,b) -> "x" ),
                new FunctionFramework( (a,b) -> 2, (a,b) -> "2" )
            )
        );
    }
    
    public static FunctionFramework X3( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
            new FunctionFramework( parameters.get(0), (a,b) -> "a"),
            new TwoArgumentFunctionFramework( (a,b) -> Math.pow(a,b), (a,b) -> String.format("%s<sup>%s</sup>", a, b),
                new FunctionFramework( (a,b) -> a, (a,b) -> "x" ),
                new FunctionFramework( (a,b) -> 3, (a,b) -> "3" )
            )
        );
    }
    
    public static FunctionFramework Sine( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> Math.sin( a ), (a,b) -> String.format( "sin( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Cosine( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> Math.cos( a ), (a,b) -> String.format( "cos( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> a + " + " + b,
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Tangeant( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> Math.tan( a ), (a,b) -> String.format( "tan( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Secant( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> 1 / Math.sin( a ), (a,b) -> String.format( "sec( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Cosecant( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> 1 / Math.cos( a ), (a,b) -> String.format( "csc( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Cotangeant( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> 1 / Math.tan( a ), (a,b) -> String.format( "cot( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Arcsine( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> Math.asin( a ), (a,b) -> String.format( "Asin( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Arccosine( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> Math.acos( a ), (a,b) -> String.format( "Acos( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Arctangeant( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> Math.atan( a ), (a,b) -> String.format( "Atan( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Arcsecant( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> 1 / Math.asin( a ), (a,b) -> String.format( "Asec( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Arccosecant( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> 1 / Math.acos( a ), (a,b) -> String.format( "Acsc( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
    public static FunctionFramework Arccotangeant( ArrayList<Parameter> parameters ) {
        return new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
            new FunctionFramework( parameters.get(0), (a,b) -> "a" ),
            new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b,
                new FunctionFramework( parameters.get(1), (a,b) -> "b" ),
                new OneArgumentFunctionFramework( (a,b) -> 1 / Math.atan( a ), (a,b) -> String.format( "Acot( %s )", a ),
                    new TwoArgumentFunctionFramework( (a,b) -> a + b, (a,b) -> String.format( "%s + %s", a, b ),
                        new TwoArgumentFunctionFramework( (a,b) -> a * b, (a,b) -> a + b, 
                            new FunctionFramework( parameters.get(2), (a,b) -> "c" ),
                            new FunctionFramework( (a,b) -> a, (a,b) -> "x")
                        ),
                        new FunctionFramework( parameters.get(3), (a,b) -> "d" )
                    )
                )
            )
        );
    }
    
}
