<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="RDFHelpers"/>
		<constant value="RDF"/>
		<constant value="J"/>
		<constant value="RDFS"/>
		<constant value="OWL"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="http://www.w3.org/1999/02/22-rdf-syntax-ns#"/>
		<constant value="http://www.w3.org/2000/01/rdf-schema#"/>
		<constant value="http://www.w3.org/2002/07/owl#"/>
		<constant value="9:27-9:72"/>
		<constant value="10:28-10:67"/>
		<constant value="11:27-11:59"/>
		<constant value="self"/>
		<constant value="set"/>
		<constant value="1"/>
		<constant value="Sequence"/>
		<constant value="#native"/>
		<constant value="Set"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.flatten():J"/>
		<constant value="2"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="16"/>
		<constant value="14:7-14:10"/>
		<constant value="14:2-14:12"/>
		<constant value="14:2-14:23"/>
		<constant value="14:36-14:37"/>
		<constant value="14:36-14:54"/>
		<constant value="14:2-14:55"/>
		<constant value="e"/>
		<constant value="any"/>
		<constant value="isAnonymous"/>
		<constant value="0"/>
		<constant value="eAnnotations"/>
		<constant value="source"/>
		<constant value="Anonymous"/>
		<constant value="J.=(J):J"/>
		<constant value="B.not():B"/>
		<constant value="15"/>
		<constant value="CJ.asSequence():QJ"/>
		<constant value="QJ.first():J"/>
		<constant value="J.not():J"/>
		<constant value="17:6-17:10"/>
		<constant value="17:6-17:23"/>
		<constant value="17:33-17:34"/>
		<constant value="17:33-17:41"/>
		<constant value="17:44-17:55"/>
		<constant value="17:33-17:55"/>
		<constant value="17:6-17:56"/>
		<constant value="17:6-17:73"/>
		<constant value="17:2-17:73"/>
		<constant value="isOwlElement"/>
		<constant value="J.startsWith(J):J"/>
		<constant value="19:50-19:53"/>
		<constant value="19:65-19:75"/>
		<constant value="19:65-19:79"/>
		<constant value="19:50-19:80"/>
		<constant value="uri"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="2"/>
	<field name="4" type="2"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<set arg="1"/>
			<getasm/>
			<push arg="8"/>
			<set arg="3"/>
			<getasm/>
			<push arg="9"/>
			<set arg="4"/>
		</code>
		<linenumbertable>
			<lne id="10" begin="1" end="1"/>
			<lne id="11" begin="4" end="4"/>
			<lne id="12" begin="7" end="7"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="13" begin="0" end="8"/>
		</localvariabletable>
	</operation>
	<operation name="14">
		<context type="6"/>
		<parameters>
			<parameter name="15" type="2"/>
		</parameters>
		<code>
			<push arg="16"/>
			<push arg="17"/>
			<new/>
			<push arg="18"/>
			<push arg="17"/>
			<new/>
			<load arg="15"/>
			<call arg="19"/>
			<call arg="20"/>
			<iterate/>
			<store arg="21"/>
			<load arg="21"/>
			<call arg="22"/>
			<if arg="23"/>
			<load arg="21"/>
			<call arg="19"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="24" begin="6" end="6"/>
			<lne id="25" begin="3" end="7"/>
			<lne id="26" begin="3" end="8"/>
			<lne id="27" begin="11" end="11"/>
			<lne id="28" begin="11" end="12"/>
			<lne id="29" begin="0" end="16"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="30" begin="10" end="15"/>
			<lve slot="0" name="13" begin="0" end="16"/>
			<lve slot="1" name="31" begin="0" end="16"/>
		</localvariabletable>
	</operation>
	<operation name="32">
		<context type="2"/>
		<parameters>
		</parameters>
		<code>
			<push arg="16"/>
			<push arg="17"/>
			<new/>
			<load arg="33"/>
			<get arg="34"/>
			<iterate/>
			<store arg="15"/>
			<load arg="15"/>
			<get arg="35"/>
			<push arg="36"/>
			<call arg="37"/>
			<call arg="38"/>
			<if arg="39"/>
			<load arg="15"/>
			<call arg="19"/>
			<enditerate/>
			<call arg="40"/>
			<call arg="41"/>
			<call arg="22"/>
			<call arg="42"/>
		</code>
		<linenumbertable>
			<lne id="43" begin="3" end="3"/>
			<lne id="44" begin="3" end="4"/>
			<lne id="45" begin="7" end="7"/>
			<lne id="46" begin="7" end="8"/>
			<lne id="47" begin="9" end="9"/>
			<lne id="48" begin="7" end="10"/>
			<lne id="49" begin="0" end="17"/>
			<lne id="50" begin="0" end="18"/>
			<lne id="51" begin="0" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="30" begin="6" end="14"/>
			<lve slot="0" name="13" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="52">
		<context type="6"/>
		<parameters>
			<parameter name="15" type="2"/>
		</parameters>
		<code>
			<load arg="15"/>
			<getasm/>
			<get arg="4"/>
			<call arg="53"/>
		</code>
		<linenumbertable>
			<lne id="54" begin="0" end="0"/>
			<lne id="55" begin="1" end="1"/>
			<lne id="56" begin="1" end="2"/>
			<lne id="57" begin="0" end="3"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="13" begin="0" end="3"/>
			<lve slot="1" name="58" begin="0" end="3"/>
		</localvariabletable>
	</operation>
</asm>
