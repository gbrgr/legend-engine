// Copyright 2022 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.language.pure.grammar.test;

import org.junit.Test;

public class TestRelationalEmbeddedDataGrammarRoundtrip extends TestGrammarRoundtrip.TestGrammarRoundtripTestSuite
{

    @Test
    public void testRelationalEmbeddedData()
    {
        test(
                "###Data\n" +
                        "Data my::RelationalData\n" +
                        "{\n" +
                        "  Relational\n" +
                        "  #{\n" +
                        "    mySchema.MyTable:\n" +
                        "          'id,firstName,lastName,age\\n'+\n" +
                        "          '1,John,Doe\\n'+\n" +
                        "          '2,Nicole,Smith\\n'+\n" +
                        "          '3,Nick,Smith\\n';\n" +
                        "\n" +
                        "    mySchema.MyTable2:\n" +
                        "          'id,name\\n'+\n" +
                        "          '1,John\\n'+\n" +
                        "          '2,Jack\\n';\n" +
                        "  }#\n" +
                        "}\n"
        );
    }


}
