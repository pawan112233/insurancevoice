/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.claimprocess;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.claimprocess.handlers.CancelandStopIntentHandler;
import com.amazon.ask.claimprocess.handlers.ClaimIntentHandler;
import com.amazon.ask.claimprocess.handlers.HelpIntentHandler;
import com.amazon.ask.claimprocess.handlers.SessionEndedRequestHandler;
import com.amazon.ask.claimprocess.handlers.LaunchRequestHandler;
import com.amazon.ask.claimprocess.handlers.FallbackIntentHandler;

public class ClaimStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new ClaimIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                // Add your skill id below
                .withSkillId("amzn1.ask.skill.f869b07a-c755-451b-a75f-f9df3c8abc5e")
                .build();
    }

    public ClaimStreamHandler() {
        super(getSkill());
        //mvn org.apache.maven.plugins:maven-assembly-plugin:2.6:assembly -DdescriptorId=jar-with-dependencies package
    }

}
