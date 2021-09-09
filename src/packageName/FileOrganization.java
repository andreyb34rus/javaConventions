/*
 * Beginning comments are following in this section.
 * All source files should begin with a c-style comment that lists the class name,
 * version information, date, and copyright notice:
 *
 * Copyright (c) 1994, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 */

package packageName; // The first non-comment line of most Java source files is a package statement

import java.util.Scanner; // After that, import statements can follow

/**
 * Class or interface documentation comment
 */

public class FileOrganization {  // class or interface declaration
/*
 * Class/interface implementation comment if necessary.
 * This comment should contain any class-wide or interface-wide information
 * that wasn't appropriate for the class/interface documentation comment.
 */

    /**
     * CLASS_VARIABLE documentation comment
     */
    public static final int CLASS_VARIABLE = 12345; // first the public class fields

    /**
     * classVariable1 documentation comment
     */
    protected static Object classVariable1; // then the protected class fields

    static double classVariable2;           // then the package class fields

    private static int classVariable3;      // then the private class fields

    public String instanceVariable1;        // After class fields instance fields are listed. First public.

    protected String instanceVariable2;     // then the protected instance fields

    String instanceVariable3;               // then the package instance fields

    private String instanceVariable4;       // then the private instance fields

    /**
     * Constructor documentation comment
     * This is by default constructor (without arguments)
     */
    public FileOrganization() {  // Constructors are following after fields
    }

    public FileOrganization(String instanceVariable1, String instanceVariable2) { // constructor with arguments
        this.instanceVariable1 = instanceVariable1;
        this.instanceVariable2 = instanceVariable2;
    }


    /**
     * Main method documentation comment.
     * These methods should be grouped by functionality rather than by scope or accessibility.
     * For example, a private class method can be in between two public instance methods. The goal is
     * to make reading and understanding the code easier
     * @param args
     */
    public static void main(String[] args) { // Methods goes after constructor(s) or fields declarations
        // some comments here
        // and here
        String string = "Some text";
        Scanner scanner = new Scanner(string);
    }

    private static void doSomething(){
        System.out.println("doSomething");
    }
}
