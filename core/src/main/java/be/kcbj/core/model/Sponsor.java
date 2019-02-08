/*
    Copyright 2017 Litrik De Roy

    This file is part of KCBJ Sponsors.

    KCBJ Sponsors is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    KCBJ Sponsors is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with KCBJ Sponsors.  If not, see <http://www.gnu.org/licenses/>.

 */

package be.kcbj.core.model;

import java.util.Locale;

public class Sponsor {

    public String name;
    public String name2;
    public String address;
    public String address2;
    public String image;
    public int imageWidth;
    public int imageHeight;

    public boolean twoColumns;
    public boolean twoRows;

    public boolean isMajor() {
        return twoColumns || twoRows;
    }

    public boolean isTodo() {
        return name != null && name.toLowerCase(Locale.getDefault()).contains("todo");
    }

}
