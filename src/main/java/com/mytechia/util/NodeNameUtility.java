/*******************************************************************************
 *   
 *   Copyright 2008 Mytech Ingenieria Aplicada <http://www.mytechia.com>, Alejandro Paz
 * 
 *   This file is part of Robobo Util.
 *
 *   Mytechia Commons is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Robobo Util is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with Mytechia Commons.  If not, see <http://www.gnu.org/licenses/>.
 * 
 ******************************************************************************/
package com.mytechia.util;

/**
 *
 * @author Julio Alberto Gomez Fernandez
 */
public class NodeNameUtility {

    private static String prefix = "robobo";

    public static String createNodeName(String nameRobobo, String nodeName) {

        if ((nameRobobo == null) || (nameRobobo.isEmpty())) {
            return String.format("%s/%s", prefix, nodeName);
        } else {
            return String.format("%s/%s/%s", prefix, nameRobobo, nodeName);
        }

    }

    public static String createNodeAction(String nameRobobo, String nameAction) {

        if ((nameRobobo == null) || (nameRobobo.isEmpty())) {
            return String.format("%s", nameAction);
        } else {
            return String.format("%s_%s/%s", prefix, nameRobobo, nameAction);
        }

    }

}
