package com.zodiackillerciphers.ciphers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.zodiackillerciphers.cosine.CosineSimilarity;
import com.zodiackillerciphers.cosine.CosineSimilarityResult;
import com.zodiackillerciphers.io.FileUtil;

public class Ciphers {

	static int which = 5;

	
	public static String Z408_SOLUTION = "ilikekillingpeoplebecauseitissomuchfunitismorefunthankillingwildgameintheforrestbecausemanisthemoatdangertueanamalofalltokillsomethinggivesmethemoatthrillingexperenceitisevenbetterthangettingyourrocksoffwithagirlthebestpartofitiathaewhenidieiwillbereborninparadicesndalltheihavekilledwillbecomemyslavesiwillnotgiveyoumynamebecauseyouwilltrytosloidownorstopmycollectingofslavesformyafterlifeebeorietemethhpiti";
	public static String Z408_SOLUTION_18 = "ebeorietemethhpiti";
	public static String ALIK_SOLUTION = "idecidedtowriteacipherthatcloselyresemblestheonecreatedthatnoonehassolvedyetiwantthenumberofcharacterstomatchsotwatwecanuseittoimprovethetoolsweusetoexploretheoriginalunsolhedcipheratthispointiwouldliketomentionidonotcollectslahesandiknowhowtoproperlyspellparadiceiwouldalsoliketomentioniamhungryinmyafterlifeslaveswillmakemefreshsandwiches";
	public static final Cipher[] cipher = {
		// 340 character unsolved Zodiac cipher
		//original one with mistakes from http://www.dtm.ciw.edu/chris/z/340explain.html    "HER>pl^VPkI1LTG2dNp+B(#O%DWY.<\\Kf)By:cM+UZGW()L#zHJSpp7^l8\\V3pO++RK2_9M+ztjdI5FP+&4k/p8R^FlO-\\dCkF>2D(#5+Kq%;2UcXGV.zLI(G2Jfj#O+_NYz+@L9d<M+b+ZR2FBcyA64K-zlUV+^J+Op7<FBy-U+R/5tEIDYBpbTMKO2<clRjI\\5T5M.+&BFz69Sy#+NI5FBc(;8RlGFN^f525b.cV5t++yBX1\\:49CE>VUZ5-+Ic.3zBK(Op^.fMqG2RcT+L52C<+FlWBI)L++)WCzWcPOSHT/()pIFkdW<7tB_YOB\\-Cc>MDHNpkSzZO8AIK;+",
		//original webtoy transcription: "HER>pl^VPkI1LTG2dNp+B(#O%DWY.<\\Kf)By:cM+UZGW()L#zHJSpp7^l8\\V3pO++RK2_9M+ztjdI5FP+&4k/p8R^FlO-\\dCkF>2D(#5+Kq%;2UcXGV.zLI(G2Jfj#O+_NYz+@L9d<M+b+ZR2FBcyA64K-zlUV+^J+Op7<FBy-U+R/5tEIDYBpbTMKO2<clRJI\\5T4M.+&BFz69Sy#+NI5FBc(;8RlGFN^f524b.cV4t++yBX1\\:49CE>VUZ5-+Ic.3zBK(Op^.fMqG2RcT+L16C<+FlWBI)L++)WCzWcPOSHT/()pIFkdW<7tB_YOB\\-Cc>MDHNpkSzZO8AIK;+",
		new Cipher("Z340: Zodiac killer's unsolved 340 cipher", "HER>pl^VPk|1LTG2dNp+B(#O%DWY.<*Kf)By:cM+UZGW()L#zHJSpp7^l8*V3pO++RK2_9M+ztjd|5FP+&4k/p8R^FlO-*dCkF>2D(#5+Kq%;2UcXGV.zL|(G2Jfj#O+_NYz+@L9d<M+b+ZR2FBcyA64K-zlUV+^J+Op7<FBy-U+R/5tE|DYBpbTMKO2<clRJ|*5T4M.+&BFz69Sy#+N|5FBc(;8RlGFN^f524b.cV4t++yBX1*:49CE>VUZ5-+|c.3zBK(Op^.fMqG2RcT+L16C<+FlWB|)L++)WCzWcPOSHT/()p|FkdW<7tB_YOB*-Cc>MDHNpkSzZO8A|K;+",null),
		new Cipher("Z408: Zodiac killer's solved 408 cipher","9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!qYeMJY^UIk7qTtNQYD5)S(/9#BPORAU%fRlqEk^LMZJdr\\pFHVWe8Y@+qGD9KI)6qX85zS(RNtIYElO8qGBTQS#BLd/P#B@XqEHMU^RRkcZKqpI)Wq!85LMr9#BPDR+j=6\\N(eEUHkFZcpOVWI5+tL)l^R6HI9DR_TYr\\de/@XJQAP5M8RUt%L)NVEKH=GrI!Jk598LMlNA)Z(PzUpkA9#BVW\\+VTtOP^=SrlfUe67DzG%%IMNk)ScE/9%%ZfAP#BVpeXqWq_F#8c+@9A9B%OT5RUc+_dYq_^SqWVZeGYKE_TYA9%#Lt_H!FBX9zXADd\\7L!=q_ed##6e5PORXQF%GcZ@JTtq_8JI+rBPQW6VEXr9WI6qEHM)=UIk",Z408_SOLUTION),
		new Cipher("Z13: Zodiac killer's unsolved 13-char cipher", "AENz8K8M8tNAM", null),
		new Cipher("Z32: Zodiac killer's unsolved 32-char cipher", "C9J|#OktAMf8oORTGX6FDVj%HCELzPW9", null),

		
		// 4: flipped and rotated, equivalent to reading 340 from top to bottom and left to right.
		new Cipher("Z340 Reading from top to bottom and left to right","HNBS_p#(d-U2zly|R+|>Epyp985G<z+<6GBcc+FMR+:pMR+2MlRc9FX.T)kD>Bc7+^KJ+U/lSN13+WdHp(M^zFqfbV5Ry^*zLCWNl#+ltl%j++tJ#f:B1z<p^OU8jO;#Z^E|+54K6W7kV%Z*d-2ORJ|*N29(CctSPDGV|*U+2+D5|4CO<PBzkWW35dc_FOYT5bEp+O_Z|Y(pFCXNBpB4F.>^FSYO1.)OPkGYc7pMBcV.lHO8L<L++FVzy<b.cVUfWTBAT*#+&>.+AFT+(4ZMB/*|GKzR42z@6BM&;t5q|(-K2fHKkDLL4yKB8+-G))C;d)J2/(|9K-OFR++2Lpc+", null),

		// 5: horizontal flip only.  this produced greater homophone-related scores in several experiments. 
		new Cipher("Z340 Horizontal flip", "d2GTL1|kPV^lp>REH)fK*<.YWD%O#(B+pNJHz#L)(WGZU+Mc:yB2KR++Op3V*8l^7ppS/k4&+PF5|djtz+M9_(D2>FkCd*-OlF^R8p|Lz.VGXcU2;%qK+5#9L@+zYN_+O#jfJ2G(K46AycBF2RZ+b+M<d-yBF<7pO+J^+VUlz-OKMTbpBYD|Et5/R+UFB&+.M4T5*|JRlc<2R8;(cBF5|N+#yS96z++t4Vc.b425f^NFGl+-5ZUV>EC94:*1XBy2GqMf.^pO(KBz3.c|L)|BWlF+<C61L+TcRp)(/THSOPcWzCW)++cC-*BOY_Bt7<WdkF|+;K|A8OZzSkpNHDM>", null),
		
		//  original 340 concatenated with flip/rotation, used to find bidirectional repeated n-grams
		//new Cipher("Z340 - original 340 concatenated with flip/rotation, used to find bidirectional repeated n-grams", "HER>pl^VPk|1LTG2dNp+B(#O%DWY.<*Kf)By:cM+UZGW()L#zHJSpp7^l8*V3pO++RK2_9M+ztjd|5FP+&4k/p8R^FlO-*dCkF>2D(#5+Kq%;2UcXGV.zL|(G2Jfj#O+_NYz+@L9d<M+b+ZR2FBcyA64K-zlUV+^J+Op7<FBy-U+R/5tE|DYBpbTMKO2<clRJ|*5T4M.+&BFz69Sy#+N|5FBc(;8RlGFN^f524b.cV4t++yBX1*:49CE>VUZ5-+|c.3zBK(Op^.fMqG2RcT+L16C<+FlWB|)L++)WCzWcPOSHT/()p|FkdW<7tB_YOB*-Cc>MDHNpkSzZO8A|K;+HNBS_p#(d-U2zly|R+|>Epyp985G<z+<6GBcc+FMR+:pMR+2MlRc9FX.T)kD>Bc7+^KJ+U/lSN13+WdHp(M^zFqfbV5Ry^*zLCWNl#+ltl%j++tJ#f:B1z<p^OU8jO;#Z^E|+54K6W7kV%Z*d-2ORJ|*N29(CctSPDGV|*U+2+D5|4CO<PBzkWW35dc_FOYT5bEp+O_Z|Y(pFCXNBpB4F.>^FSYO1.)OPkGYc7pMBcV.lHO8L<L++FVzy<b.cVUfWTBAT*#+&>.+AFT+(4ZMB/*|GKzR42z@6BM&;t5q|(-K2fHKkDLL4yKB8+-G))C;d)J2/(|9K-OFR++2Lpc+", null),
		
		// 6: best version of the 340 from quadrant experiment 2
		new Cipher("Z340 Best version from quadrant experiment 2","*V3pO++RK28l^7ppSZGW()L#zHJU+Mc:yB%DWY.<*Kf)O#(B+pNVPk|1LTG2d^lp>REH+;K|A8OZzSkpNHDM>cC-*BOY_Bt7<WdkF|p)(/THSOPcWzCW)++L)|BWlF+<C61L+TcR2GqMf.^pO(KBz3.c|+-5ZUV>EC94:*1XBy++t4Vc.b425f^NFGlR8;(cBF5|N+#yS96zFB&+.M4T5*|JRlc<2OKMTbpBYD|Et5/R+U-yBF<7pO+J^+VUlz-K46AycBF2RZ+b+M<d9L@+zYN_+O#jfJ2G(|Lz.VGXcU2;%qK+5#(D2>FkCd*-OlF^R8p/k4&+PF5|djtz+M9_", null),
		// 7
		new Cipher("Z340 Re-arrangement by Jurgen Koller", "HER>pl^VPk|1LTGNp+B(#O%DWY.<*KBy:cM+UZGW()L#zSpp7^l8*V3pO++R_9M+ztjd|5FP+&4p8R^FlO-*dCkF>2#5+Kq%;2UcXGV.z(G2Jfj#O+_NYz+2df)HJK2k/D(L|@L9d<M+b+ZR2FBcyA64K-zlUV+^J+Op7<FBy-U+R/5tE|DYBpbTMKO2<clRJ|*5T4M.+&BFz69Sy#+N|5FBc(;8RlGFN^f524b.cV4t++yBX1*:49CE>VUZ5-+|c.3zBK(Op^.fMqG2RcT+L16C<+FlWB|)L++)WczWcPOSHT/()p|FkdW<7tB_YOB*-Cc>MDHNpkSzZO8A|K;+", null),
		
		// 8
		new Cipher("Z340 Re-arrangement by Nick Pelling", "d>2k|RTLGVlH1^EpP)BfWY+*<K%#N.Op(DJcHW(:#LzZ+B)UyMG27K3pp++R*lSO8p^V/+k5FM&+4dt_Pj9z|(^DdCR>F2-lpkO8F*|KLcX+.Vz2%#G;5qU9JL_N2+z@Oj(Y#Gf+K+4FBMAy6R+dcZ<b2-UyOplF<BJ+-7^zV+O/KYBRTbM|tUpE+5DFlBT4c+.&*J2M|<R5RS85F9(c;N#zB+6y|+N+b.F4Vt2flc5G^4+1-E>XZU59:yV4B*C23Gp^.Mfq(B|.KczOL+)+FTBW|C1Rl6cL<pW)OS)/T(cz+HW+CPcdC_Yk*B-t<|O7FWB+H;ZOD|AKSp>8kMNz", null),
		// 9: the 340 with all + symbols removed
		new Cipher("Z340 All + symbols removed", "HER>pl^VPk|1LTG2dNpB(#O%DWY.<*Kf)By:cMUZGW()L#zHJSpp7^l8*V3pORK2_9Mztjd|5FP&4k/p8R^FlO-*dCkF>2D(#5Kq%;2UcXGV.zL|(G2Jfj#O_NYz@L9d<MbZR2FBcyA64K-zlUV^JOp7<FBy-UR/5tE|DYBpbTMKO2<clRJ|*5T4M.&BFz69Sy#N|5FBc(;8RlGFN^f524b.cV4tyBX1*:49CE>VUZ5-|c.3zBK(Op^.fMqG2RcTL16C<FlWB|)L)WCzWcPOSHT/()p|FkdW<7tB_YOB*-Cc>MDHNpkSzZO8A|K;", null),
		
		new Cipher("Z340 All + symbols replaced by unique symbols", "HER>–Ã^VPÀI≤LTG±ƒN–aB¢∑O∫DWyï<ªK∆£BüÑ√MeuZGW¢£L∑§HJS––Ω^ÃæªV¥–OghRK±∏ºMi§‘jƒIµFPmà≥À/–æR^FÃO-ªƒCÀF>±D¢∑µnK—∫É±u√XGVï§LI¢G±J∆j∑Oo∏Ny§rπLºƒ<Ms¬uZR±FB√üA∞≥K-§ÃuVv^JwO–Ω<FBü-uxR/µ‘EIDyB–¬TMKO±<√ÃRJIªµT≥MïQàBF§∞ºSü∑0NIµFB√¢ÉæRÃGFN^∆µ±≥¬ï√V≥‘`~üBX≤ªÑ≥ºCE>VuZµ-!I√ï¥§BK¢O–^ï∆M—G±R√T$L≤∞C<=FÃWBI£L{}£WC§W√POSHT/¢£–IFÀƒW<Ω‘B∏yOBª-C√>MDHN–ÀS§ZOæAIKÉ+", null),
		new Cipher("Z340 Top half only","HER>pl^VPk|1LTG2dNp+B(#O%DWY.<*Kf)By:cM+UZGW()L#zHJSpp7^l8*V3pO++RK2_9M+ztjd|5FP+&4k/p8R^FlO-*dCkF>2D(#5+Kq%;2UcXGV.zL|(G2Jfj#O+_NYz+@L9d<M+b+ZR2FBcyA64K-zlUV+^J+Op7<FBy-",null),
		new Cipher("Z340 Bottom half only","U+R/5tE|DYBpbTMKO2<clRJ|*5T4M.+&BFz69Sy#+N|5FBc(;8RlGFN^f524b.cV4t++yBX1*:49CE>VUZ5-+|c.3zBK(Op^.fMqG2RcT+L16C<+FlWB|)L++)WCzWcPOSHT/()p|FkdW<7tB_YOB*-Cc>MDHNpkSzZO8A|K;+",null),
		new Cipher("Z340 In oxcart path by kfreeze", "HER>–Ã^VPÀI≤LTG±ƒ£∆Kª<ïyWD∫O∑¢B+–NBüÑ√M+uZGW¢£L∑§HJ±KR++O–¥VªæÃ^Ω––S∏ºM+§‘jƒIµFP+à≥À/¢D±>FÀCƒª-OÃF^Ræ–∑µ+K—∫É±u√XGVï§LIºLπ+§yN∏+O∑j∆J±G¢ƒ<M+¬+ZR±FB√üA∞≥K-üBF<Ω–O+J^+VuÃ§-u+R/µ‘EIDyB–¬TMKOFBà+ïM≥TµªIJRÃ√<±§∞ºSü∑+NIµFB√¢ÉæR++‘≥V√ï¬≥±µ∆^NFGÃüBX≤ªÑ≥ºCE>VuZµ-+±G—M∆ï^–O¢KB§¥ï√IR√T+L≤∞C<+FÃWBI£L–£¢/THSOP√W§CW£++IFÀƒW<Ω‘B∏yOBª-C√+ÉKIAæOZ§SÀ–NHDM>", null),

		// 3: a random permutation of rows of the 408.  used to test heuristic searches for homophone candidates.
		// the permutation is:  47 11 39 44 38 3 18 19 31 32 29 33 10 46 37 26 25 28 12 17 40 45 0 6
		new Cipher("Z408 Random permutation of rows","Z@JTtq_8JI+rBPQW6VB#PAfZ%%9/EcS)kNMI%%GzD76eUflrS=^@+qGD9KI)6qX85zS(B9A9@+c8#F_qWqXepH6R^l)Lt+5IWVOpcZVEXr9WI6qEHM)=UIk#9rML58!qW)IpqKZcFkHUEe(N\\6=j+RDPBAQJX@/ed\\rYT_RD9IP5M8RUt%L)NVEKH=GWV+eGYF69HP@K!qYe%OT5RUc+_dYq_^SqWPOtTV+\\WVB#9AkpUzY8eWVHFp\\rdJZML^k)5DYQNtTq7kIU^YJMq=!L7\\dDAXz9XBF!HVZeGYKE_TYA9%#Lt_RNtIYElO8qGBTQS#BLd/P#B@XqEHMU^RRkEqlRf%UAROPB#9/(ScG%FQXROP5e6##de_P(Z)ANlML895kJ!IrB=Xp=ROk%BU/Z/P%9", Z408_SOLUTION),

		// 4: a grid-oriented permutation of the 408 used for structure-based seearches
		// permutation is: 0,30,1,31,2,32,3,33,4,34,5,35,17,47,16,46,15,45,14,44,13,43,12,42
		new Cipher("Z408 Grid-oriented permutation used for structure-based seearches","9%P/Z/UB%kOR=pX=BB#SQTBGq8OlEYItNRWV+eGYF69HP@K!qYekRR^UMHEqX@B#P/dLMJY^UIk7qTtNQYD5)#9rML58!qW)IpqKZcS(/9#BPORAU%fRlqEFkHUEe(N\\6=j+RDPBk^LMZJdr\\pFHVWe8YH6R^l)Lt+5IWVOpcZ@+qGD9KI)6qX85zS(AQJX@/ed\\rYT_RD9IpeXqWq_F#8c+@9A9BkIU=)MHEq6IW9rXEVNk)ScE/9%%ZfAP#BV6WQPBr+IJ8_qtTJ@Z^=SrlfUe67DzG%%IMcG%FQXROP5e6##de_zUpkA9#BVW\\+VTtOPq=!L7\\dDAXz9XBF!HrI!Jk598LMlNA)Z(P_tL#%9AYT_EKYGeZVP5M8RUt%L)NVEKH=GWqS^_qYd_+cUR5TO%", Z408_SOLUTION),

		// 8: best version of the 408 from quadrant experiment 2
		new Cipher("Z408 Best version from quadrant experiment 2", "VB#PAfZ%%9/EcS)kNMI%%GzD76eUflrS=^POtTV+\\WVB#9AkpUzP(Z)ANlML895kJ!IrG=HKEVN)L%tUR8M5PAQJX@/ed\\rYT_RD9IH6R^l)Lt+5IWVOpcZFkHUEe(N\\6=j+RDPB#9rML58!qW)IpqKZckRR^UMHEqX@B#P/dLB#SQTBGq8OlEYItNR(Sz58Xq6)IK9DGq+@Y8eWVHFp\\rdJZML^kEqlRf%UAROPB#9/(S)5DYQNtTq7kIU^YJMeYq!K@PH96FYGe+VWB=Xp=ROk%BU/Z/P%9kIU=)MHEIODYd86WQPBr+qJPAT_#cG%FQXR685X_+Fq=!L7\\dI_ezEc__tL#%9AWq69KUqWqS^_qY9t#XYRWB9A9@+crT#BG5qXJdFeTXE@e!ZOeVZ_HV%p", Z408_SOLUTION),

		new Cipher("Z408 1st section only","9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!qYeMJY^UIk7qTtNQYD5)S(/9#BPORAU%fRlqEk^LMZJdr\\pFHVWe8Y@+qGD9KI)6qX85zS(RNtIYElO8qGBTQS#BLd/P#B@XqEHMU^RRk",Z408_SOLUTION),
		new Cipher("Z408 2nd section only","cZKqpI)Wq!85LMr9#BPDR+j=6\\N(eEUHkFZcpOVWI5+tL)l^R6HI9DR_TYr\\de/@XJQAP5M8RUt%L)NVEKH=GrI!Jk598LMlNA)Z(PzUpkA9#BVW\\+VTtOP^=SrlfUe67DzG%%IM",Z408_SOLUTION),
		new Cipher("Z408 3rd section only","Nk)ScE/9%%ZfAP#BVpeXqWq_F#8c+@9A9B%OT5RUc+_dYq_^SqWVZeGYKE_TYA9%#Lt_H!FBX9zXADd\\7L!=q_ed##6e5PORXQF%GcZ@JTtq_8JI+rBPQW6VEXr9WI6qEHM)=UIk",Z408_SOLUTION),

		new Cipher("Z408 last 18 only","6VEXr9WI6qEHM)=UIk",Z408_SOLUTION_18),
		
		new Cipher("Z408 Homophone set [ENWZ6p+] replaced by single symbol [Z]", "9%P/Z/UB%kOR=ZX=BZVZeGYFZ9HP@K!qYeMJY^UIk7qTtZQYD5)S(/9#BPORAU%fRlqZk^LMZJdr\\ZFHVZe8Y@ZqGD9KI)ZqX85zS(RZtIYZlO8qGBTQS#BLd/P#B@XqZHMU^RRkcZKqZI)Zq!85LMr9#BPDRZj=Z\\Z(eZUHkFZcZOVZI5ZtL)l^RZHI9DR_TYr\\de/@XJQAP5M8RUt%L)ZVZKH=GrI!Jk598LMlZA)Z(PzUZkA9#BVZ\\ZVTtOP^=SrlfUeZ7DzG%%IMZk)ScZ/9%%ZfAP#BVZeXqZq_F#8cZ@9A9B%OT5RUcZ_dYq_^SqZVZeGYKZ_TYA9%#Lt_H!FBX9zXADd\\7L!=q_ed##Ze5PORXQF%GcZ@JTtq_8JIZrBPQZZVZXr9ZIZqZHM)=UIk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [HIL5] replaced by single symbol [H]", "9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!qYeMJY^UHk7qTtNQYDH)S(/9#BPORAU%fRlqEk^HMZJdr\\pFHVWe8Y@+qGD9KH)6qX8HzS(RNtHYElO8qGBTQS#BHd/P#B@XqEHMU^RRkcZKqpH)Wq!8HHMr9#BPDR+j=6\\N(eEUHkFZcpOVWHH+tH)l^R6HH9DR_TYr\\de/@XJQAPHM8RUt%H)NVEKH=GrH!JkH98HMlNA)Z(PzUpkA9#BVW\\+VTtOP^=SrlfUe67DzG%%HMNk)ScE/9%%ZfAP#BVpeXqWq_F#8c+@9A9B%OTHRUc+_dYq_^SqWVZeGYKE_TYA9%#Ht_H!FBX9zXADd\\7H!=q_ed##6eHPORXQF%GcZ@JTtq_8JH+rBPQW6VEXr9WH6qEHM)=UHk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [FK7@] replaced by single symbol [F]", "9%P/Z/UB%kOR=pX=BWV+eGYF69HPFF!qYeMJY^UIkFqTtNQYD5)S(/9#BPORAU%fRlqEk^LMZJdr\\pFHVWe8YF+qGD9FI)6qX85zS(RNtIYElO8qGBTQS#BLd/P#BFXqEHMU^RRkcZFqpI)Wq!85LMr9#BPDR+j=6\\N(eEUHkFZcpOVWI5+tL)l^R6HI9DR_TYr\\de/FXJQAP5M8RUt%L)NVEFH=GrI!Jk598LMlNA)Z(PzUpkA9#BVW\\+VTtOP^=SrlfUe6FDzG%%IMNk)ScE/9%%ZfAP#BVpeXqWq_F#8c+F9A9B%OT5RUc+_dYq_^SqWVZeGYFE_TYA9%#Lt_H!FBX9zXADd\\FL!=q_ed##6e5PORXQF%GcZFJTtq_8JI+rBPQW6VEXr9WI6qEHM)=UIk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [TXd!] replaced by single symbol [T]", "9%P/Z/UB%kOR=pT=BWV+eGYF69HP@KTqYeMJY^UIk7qTtNQYD5)S(/9#BPORAU%fRlqEk^LMZJTr\\pFHVWe8Y@+qGD9KI)6qT85zS(RNtIYElO8qGBTQS#BLT/P#B@TqEHMU^RRkcZKqpI)WqT85LMr9#BPDR+j=6\\N(eEUHkFZcpOVWI5+tL)l^R6HI9DR_TYr\\Te/@TJQAP5M8RUt%L)NVEKH=GrITJk598LMlNA)Z(PzUpkA9#BVW\\+VTtOP^=SrlfUe67DzG%%IMNk)ScE/9%%ZfAP#BVpeTqWq_F#8c+@9A9B%OT5RUc+_TYq_^SqWVZeGYKE_TYA9%#Lt_HTFBT9zTADT\\7LT=q_eT##6e5PORTQF%GcZ@JTtq_8JI+rBPQW6VETr9WI6qEHM)=UIk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [DO(^] replaced by single symbol [D]", "9%P/Z/UB%kDR=pX=BWV+eGYF69HP@K!qYeMJYDUIk7qTtNQYD5)SD/9#BPDRAU%fRlqEkDLMZJdr\\pFHVWe8Y@+qGD9KI)6qX85zSDRNtIYElD8qGBTQS#BLd/P#B@XqEHMUDRRkcZKqpI)Wq!85LMr9#BPDR+j=6\\NDeEUHkFZcpDVWI5+tL)lDR6HI9DR_TYr\\de/@XJQAP5M8RUt%L)NVEKH=GrI!Jk598LMlNA)ZDPzUpkA9#BVW\\+VTtDPD=SrlfUe67DzG%%IMNk)ScE/9%%ZfAP#BVpeXqWq_F#8c+@9A9B%DT5RUc+_dYq_DSqWVZeGYKE_TYA9%#Lt_H!FBX9zXADd\\7L!=q_ed##6e5PDRXQF%GcZ@JTtq_8JI+rBPQW6VEXr9WI6qEHM)=UIk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [PU9k] replaced by single symbol [P]", "P%P/Z/PB%POR=pX=BWV+eGYF6PHP@K!qYeMJY^PIP7qTtNQYD5)S(/P#BPORAP%fRlqEP^LMZJdr\\pFHVWe8Y@+qGDPKI)6qX85zS(RNtIYElO8qGBTQS#BLd/P#B@XqEHMP^RRPcZKqpI)Wq!85LMrP#BPDR+j=6\\N(eEPHPFZcpOVWI5+tL)l^R6HIPDR_TYr\\de/@XJQAP5M8RPt%L)NVEKH=GrI!JP5P8LMlNA)Z(PzPpPAP#BVW\\+VTtOP^=SrlfPe67DzG%%IMNP)ScE/P%%ZfAP#BVpeXqWq_F#8c+@PAPB%OT5RPc+_dYq_^SqWVZeGYKE_TYAP%#Lt_H!FBXPzXADd\\7L!=q_ed##6e5PORXQF%GcZ@JTtq_8JI+rBPQW6VEXrPWI6qEHM)=PIP", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [GS8l] replaced by single symbol [G]", "9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!qYeMJY^UIk7qTtNQYD5)G(/9#BPORAU%fRGqEk^LMZJdr\\pFHVWeGY@+qGD9KI)6qXG5zG(RNtIYEGOGqGBTQG#BLd/P#B@XqEHMU^RRkcZKqpI)Wq!G5LMr9#BPDR+j=6\\N(eEUHkFZcpOVWI5+tL)G^R6HI9DR_TYr\\de/@XJQAP5MGRUt%L)NVEKH=GrI!Jk59GLMGNA)Z(PzUpkA9#BVW\\+VTtOP^=GrGfUe67DzG%%IMNk)GcE/9%%ZfAP#BVpeXqWq_F#Gc+@9A9B%OT5RUc+_dYq_^GqWVZeGYKE_TYA9%#Lt_H!FBX9zXADd\\7L!=q_ed##6e5PORXQF%GcZ@JTtq_GJI+rBPQW6VEXr9WI6qEHM)=UIk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [rt\\] replaced by single symbol [r]", "9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!qYeMJY^UIk7qTrNQYD5)S(/9#BPORAU%fRlqEk^LMZJdrrpFHVWe8Y@+qGD9KI)6qX85zS(RNrIYElO8qGBTQS#BLd/P#B@XqEHMU^RRkcZKqpI)Wq!85LMr9#BPDR+j=6rN(eEUHkFZcpOVWI5+rL)l^R6HI9DR_TYrrde/@XJQAP5M8RUr%L)NVEKH=GrI!Jk598LMlNA)Z(PzUpkA9#BVWr+VTrOP^=SrlfUe67DzG%%IMNk)ScE/9%%ZfAP#BVpeXqWq_F#8c+@9A9B%OT5RUc+_dYq_^SqWVZeGYKE_TYA9%#Lr_H!FBX9zXADdr7L!=q_ed##6e5PORXQF%GcZ@JTrq_8JI+rBPQW6VEXr9WI6qEHM)=UIk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [B#%] replaced by single symbol [B]", "9BP/Z/UBBkOR=pX=BWV+eGYF69HP@K!qYeMJY^UIk7qTtNQYD5)S(/9BBPORAUBfRlqEk^LMZJdr\\pFHVWe8Y@+qGD9KI)6qX85zS(RNtIYElO8qGBTQSBBLd/PBB@XqEHMU^RRkcZKqpI)Wq!85LMr9BBPDR+j=6\\N(eEUHkFZcpOVWI5+tL)l^R6HI9DR_TYr\\de/@XJQAP5M8RUtBL)NVEKH=GrI!Jk598LMlNA)Z(PzUpkA9BBVW\\+VTtOP^=SrlfUe67DzGBBIMNk)ScE/9BBZfAPBBVpeXqWq_FB8c+@9A9BBOT5RUc+_dYq_^SqWVZeGYKE_TYA9BBLt_H!FBX9zXADd\\7L!=q_edBB6e5PORXQFBGcZ@JTtq_8JI+rBPQW6VEXr9WI6qEHM)=UIk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [M)] replaced by single symbol [M]", "9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!qYeMJY^UIk7qTtNQYD5MS(/9#BPORAU%fRlqEk^LMZJdr\\pFHVWe8Y@+qGD9KIM6qX85zS(RNtIYElO8qGBTQS#BLd/P#B@XqEHMU^RRkcZKqpIMWq!85LMr9#BPDR+j=6\\N(eEUHkFZcpOVWI5+tLMl^R6HI9DR_TYr\\de/@XJQAP5M8RUt%LMNVEKH=GrI!Jk598LMlNAMZ(PzUpkA9#BVW\\+VTtOP^=SrlfUe67DzG%%IMNkMScE/9%%ZfAP#BVpeXqWq_F#8c+@9A9B%OT5RUc+_dYq_^SqWVZeGYKE_TYA9%#Lt_H!FBX9zXADd\\7L!=q_ed##6e5PORXQF%GcZ@JTtq_8JI+rBPQW6VEXr9WI6qEHMM=UIk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [JQ] replaced by single symbol [J]", "9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!qYeMJY^UIk7qTtNJYD5)S(/9#BPORAU%fRlqEk^LMZJdr\\pFHVWe8Y@+qGD9KI)6qX85zS(RNtIYElO8qGBTJS#BLd/P#B@XqEHMU^RRkcZKqpI)Wq!85LMr9#BPDR+j=6\\N(eEUHkFZcpOVWI5+tL)l^R6HI9DR_TYr\\de/@XJJAP5M8RUt%L)NVEKH=GrI!Jk598LMlNA)Z(PzUpkA9#BVW\\+VTtOP^=SrlfUe67DzG%%IMNk)ScE/9%%ZfAP#BVpeXqWq_F#8c+@9A9B%OT5RUc+_dYq_^SqWVZeGYKE_TYA9%#Lt_H!FBX9zXADd\\7L!=q_ed##6e5PORXJF%GcZ@JTtq_8JI+rBPJW6VEXr9WI6qEHM)=UIk", Z408_SOLUTION),
		new Cipher("Z408 Homophone set [fz] replaced by single symbol [f]", "9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!qYeMJY^UIk7qTtNQYD5)S(/9#BPORAU%fRlqEk^LMZJdr\\pFHVWe8Y@+qGD9KI)6qX85fS(RNtIYElO8qGBTQS#BLd/P#B@XqEHMU^RRkcZKqpI)Wq!85LMr9#BPDR+j=6\\N(eEUHkFZcpOVWI5+tL)l^R6HI9DR_TYr\\de/@XJQAP5M8RUt%L)NVEKH=GrI!Jk598LMlNA)Z(PfUpkA9#BVW\\+VTtOP^=SrlfUe67DfG%%IMNk)ScE/9%%ZfAP#BVpeXqWq_F#8c+@9A9B%OT5RUc+_dYq_^SqWVZeGYKE_TYA9%#Lt_H!FBX9fXADd\\7L!=q_ed##6e5PORXQF%GcZ@JTtq_8JI+rBPQW6VEXr9WI6qEHM)=UIk", Z408_SOLUTION),

		new Cipher("Z408 Reduced to simple substitution cipher", "PBP/N/PBBPDR=NT=BNVNeGYFNPHPFFTqYeMJYDPHPFqTtNJYDHMGD/PBBPDRAPBzRGqNPDHMNJTttNFHVNeGYFNqGDPFHMNqTGHzGDRNtHYNGDGqGBTJGBBHT/PBBFTqNHMPDRRPcNFqNHMNqTGHHMtPBBPDRNj=NtNDeNPHPFNcNDVNHHNtHMGDRNHHPDR_TYttTe/FTJJAPHMGRPtBHMNVNFH=GtHTJPHPGHMGNAMNDPzPNPAPBBVNtNVTtDPD=GtGzPeNFDzGBBHMNPMGcN/PBBNzAPBBVNeTqNq_FBGcNFPAPBBDTHRPcN_TYq_DGqNVNeGYFN_TYAPBBHt_HTFBTPzTADTtFHT=q_eTBBNeHPDRTJFBGcNFJTtq_GJHNtBPJNNVNTtPNHNqNHMM=PHP", Z408_SOLUTION),
		new Cipher("Z408 With Rod's corrections","¼ºP/Z/uBºËOR¥ÐX¥BWV+ÅGyF°¼HP¹K‚ÑyÅMJy^uIË½ÑTÔNQyDµ£S¢/¼ºBPORAuºÆRÌÑEË^LMZJÄÒ\\ÐFHVWÅ¾y¹+ÑGD¼KI£°ÑX½µ¤S¢RNÔ‚yFÌO¾ÑGBTQSºBLÄ/PºB¹XÑEHMu^RRËÃZKÑÐI£WÑ‚½µLMÒ¼ºBPDR+Ê¥°\\N¢ÅEuHËFZÃÐOVWIµ+ÔL£Ì^R°HI¼DR¸TyÒ\\ÄÅ/¹XJQAPµM¾RuÔºL£NVEKH¥GÒI‚JËµ¼½LMÌHA£Z¢P¤uÐËA¼ºBVW\\+VTÔOP^¥SÒÌÆuÅ°¾D¤GººIMNË£SÃE/¼ººZÆAPºBVÐÅXÑWÑ¸Fº¾Ã+¹¼A¼BºOTµRuÃ+¸ÄyÑ¸^SÑWVZÅGyKE¸TyA¼ººLÔ¸H‚FBXA¤XADÄ\\½L‚¥Ñ¸ÅÄºº°ÅµPORXQFºGÃZ¹JTÔÑ¸¾JI+ÒBPQW°VEXÒ¼WI°ÑEHM£¥uIË",Z408_SOLUTION),
		
		
		/* alanbenjy320.example. ? replaced by ¥.  hints: "Its a Song Lyric.  There is a Repeated 9 letter word (not adjacent)."   http://www.zodiackillerfacts.com/forum/viewtopic.php?f=50&t=446 */
		new Cipher("Test cipher by alanbenjy (very difficult, unsolved)", "!#$%&()*+,-./0123456789:;<=>¥@(A&BCDE@F9GHI.J;/KL¥MNOPQRST!U&V!()WAXYZ[,S]1^_@`a0;*bDcd:DAef=(ghEahS(+i-D_AjWklm/`BfEnopbOQGNOqrostuL$vwxyVty7z{|jz@1}Nh~Ā3sRāĂ>ăĄxOąPEĆIJą-4Yć&4|Ĉĉv^Ċćċl6ČčĎcă|4PO6ĄďĐđxRĒbĎēĔČ8XĕĄWċĖn<ėĎ0@IĘĖY2SĀ0;đĎęďĐNI@ĚĚhďěĂ-ĜĎ%;ĕ#ĝ86JĚxX[ĞO[>W@ĉĜĂ}Ď&8ēhğPĔĞkĠw9:Zġ}ćMĢģSpĔQ9ğzPTģĢĤCďāxĄ!u9Y1ġĂSB85ĕ", null),
		new Cipher("Test cipher by ALisowky", "(;+Hc^BE&pPN5FB*UcYW+T2b4FD<OK+RyT+I+JjR8I1C3#LBHlB*F/^2W.zGO7LBV4>KO<X+;y31(d)MFzW/M_Sj+lpfUC)l.DF+TIzOJ*zHVI6zP.2A+U*GZ>+(&1#cJkNpvB2VBFOORIw+Z>Bz68@Y9pTB2C+#lcq5M*RZMIp<b+EUckC+l.zFC5Ik#cG25dp_-^Rct+z7J8M2(#Gc^pMpFHOR-+D2K94bBI)L^5tLpdWpAFpYlOk+NRyKYBR9k4N.^(D+%dOZ<;*-K6<(t+z7S+GFcOL5.SV_Lqly%G:y)f2+T-(f+I-4XBKd5<9:)t+S8fN+>WI4MEPcUV/K",ALIK_SOLUTION),
		new Cipher("Test cipher by ALisowky (Vigenere)", "bkmpowllgupyqgktjqcnxqpggmjtbyxskeklluorxzbukhumpxxhbrjmoigthvvrntpabrolllkmpentmaprtntjrxhmgugkhkgkkzbbstakgyhapnzplkntnzmvzmvqzvkvdrzalbbuezerallbbkqwtbxxaprukpovtghthtlvtikwjqcnxyigzapacububvchbtqrbrmguflvgohuqqugvbpuesmpzlsisklhvqoduwjnhdbbvkvxrxefackesxnxtkqpkbdwhrwhtfuepsrzhtmazbvvvgfocamkfqasrhngkksqsklsiikldqcrfhsrsxmzryaziajppkukl", ALIK_SOLUTION),
		new Cipher("Test cipher by ALisowky (Vigenere plus homophonic)","B+LR^1.4pK()kp+J6q8IyM(_pYfOB)zV%;+*4G^DyWBS+XKYEzy2NFfLA:pO<c5DIH(dBD^*.4+ZRCIOLTEFHIJf>z2LpKp+<+_++WNBlOU+j)2TRIb(.+IJIWZcWL5kWc&P#>Wd.9BGCWCFT.*BB+k1ONzzU(DK+EAcOp2H2O*cH-+/6M8Iy):jWTRd7GBKBc729OMFN>ZpGt4P_^2SkMGpc9RG;lY(W*V-V+4<PM^#S16I2#BB5%czFzCtU8+;lzIyO+q(+N#/<F/2OtSCRlFbXJZUW95ccp3^7dL&3MUV><@p++lkV+.l--+*#M8Ft<VFlzYWF)Tb-dfRR+K+4",ALIK_SOLUTION),
		new Cipher("Test cipher by Bryianzum (part 1)", "∏ÇîV∞»º^VI^Xë+ +‘ëº^»∏Çî‘Ö∞ÄJX^ôAímë+XJëº—+ô^∆ë£º^/ëÇIXy‘Ö+nJë£ôëº£íM∞—ÀÖîm+∆—º^+∞ô7£∆í∏IXyë‘∞ô∆îHX^ë£+A∞+∆mXJ%‘ºÖºÖIXyº»^Ç‘∞H‘XVn+—môÖ7X»^º§ô^ëôÖ^À∞ë§m7£+ÖíV∏ÖmIXyÇM∞‘ÄXX/Mº^∞ÖôÖë£+∏∞^ëí^»n+∏Çî‘ëX∞mô^∆íÖ/£XAë£ºÖ%ÇyÄ∆£ôHH∞^A£+^ë£+ImAínnXA∏ÇîA£XÄ+∆Ç^ën+ë∏Çî‘Ö+nJV∞VÄÀ^∆ëXô7íëômë‘XH£+IXy%ô^ëÖíM∞∏Çî‘Ö+nJJ‘Ç—ô^y^m∞+^∞^+—∏", "youbeginbynotevertingyourselfonawasteoftimeandthinktoyourselfthatihavemisusedmineeachdayyoutreadupontheweedsofcrisisyouignoreproblemsascognizantasnietzschesabyssyouoverlookvinesastheyentangleyourtoesandaskhowthiscouldhappenwhentheyswallowyouwholedontletyourselfbeblindtoacatastropheyoucantsaveyourselffromanunseenenemy"), 
		new Cipher("Test cipher by ccactus (no E's, with encoding errors)", "K)IM3$Um8lnJ#X5-*-MTCgN(96AcPgna$HaRY6cWb0*dN4LCAORc4_RejkHFDE3#KpnAPIH!M(TUS7*50*mHaMbQd*RK4iXHVAL$AGRQXCSa#k-&LK02aiIW1TK7!QJpUmMbH9nH!T*_(OfRH@7lQbHBkSC4K67HSR-gQ3Rc561-ZN(RDd9A%X_VSUhJaRg7&XW4Mn5hRT_m*3D$IHgo!X54b*8T6cpYEHml%Cabk*I@0U9oA#$4G0QX$SW_9E3A(FUCjYnhHdKS0H4m6*CBn-IQMkg-A6(*nH!aLm4GX5JU01CPDZMb4AXH8k*n%d_Vb*F_)mX9#$B6*&%D$TF)","thisparagraphisunusualfogitsblatantomissionofthatmostcommonglyphthatbindsourconsonantsidonotthinkthatzodiacthoughtofthisbutoddphrasinganduncommonfordinvocattioncouldpossibuyfoologtrickcryptologistsasyoucanplainlydistinguishmynarrationiforgythatzodiacscgyptogrammaynotcontainavauidsolutionandthatzisprobablysittingonarockingchaighavingrlaugh"), 
		/* gardi's 340-char cipher.  ? replaced by |.  solution is approximate (the best guess of zkdecrypto) */
		new Cipher("Test cipher by gardi", "3:aON;653<!%C>.\\7#8Z<L6O\\Y|U:AO#7Y=(UB8,^aP+7/a>S#IOY5W;AOGYQ2C_Q3OF[+7PGU]N74()1\\6'\\*@M153\\86O&HRIL;3]4X56NE+*M187!Y<N[7\"\\;YMK\\3\\]6<&HR#Y.+X(>Y#]N\"(N7O3_9O'#P(M12Y+Y^>Q77>KCa4K8$3/,=(UB/,$;I]S-CO0;ND+YEQX;-BQ5\"<;Y(50>+.^18%<SO<Y\"Y3\\<,7<6*]V,/YL]B8#CF[,7_\\M:Q7`+I1DZ:\"7KO1>P5]Y<`[3O8,F*W5'J5\\)`'VZ<X*G05.BP<!(T8*\\^-+XC18%OVU\\,MG:DF(NI/V.Oa6", "rosesareredvioletsaregreenalonestnwillandsmutisonscenehaneynufiguredoutmylastcipherpetetherearedtocgaractersoutthatdnesotmeantherearedtosnlutionsasmistergeepsmithfnundouttohischairinwilliniacanbiewasfunoutabluemeaniewouldhaveneenmnreentertapningalasidontgetoutmuchfromthehomeanemoreandthepeeepmpprettywellmedicatedbutihaveplentyofdisciplesr"), 
		/* glurk's 340-char cipher, from http://zodiackiller.21.forumer.com/a/cipher-explorer_post1719.html, converted to ascii by me */
		new Cipher("Test cipher by glurk (1)", ">J&9*+%F8$WT13+!#4*J{;.RTX*5XC;E1&<9=5^<9*;=UC]HM[,6[M3=DE}.6K#3]CQDL]X-HK-_Q*8B524T-Z&<4(7)&MKADKV<K-@KMG4@#IW0:N+=L32PJ1.Z;@6G#8I;&=5^67*-4.;KT$9!ML46C;M3V!P+H-Z#7@93SK#PBP,W:*Q*1Y,}O%]L;,;X:@A#&<GZI6ABW4V3OVU17!DZJT7IQKCJH<%$G,P\\WVF<{*{=8^G#A*=AH{S3|5+'%O!MN':OQAV$UECFZOR5FCO(5J8&\"{Q4BGSNP_Z_RTW..NVACR<@UM{C+M*N4\\PMEWZ#8_!,<[]4,(WI;XS9","alternativelyandfarlessgloriouslythecipherscouldbethebacklashofaluckylowdowncriminalwithatestbookonhowtobeatfrequencyanalysisthefirstcipherwassolvedbyahusbandandwifeteamofamateurcryptanalystsoutoftheirhomeanannoyedkillercouldhavetakentherecipeforcodemakingandbegunconvolutingituntilitbecamemeaninglessenoughtobeunbreakableifindthelattersome"), 
		/* glurk's 2nd 340-char cipher, ? replaced by |, from http://zodiackiller.21.forumer.com/a/cipher-explorer_post1719.html, converted to ascii by glurk */
		new Cipher("Test cipher by glurk (2)", "j_CN<!J4e7ilK0=B4ah0Vl8C7Yk7igO4f:D`^=^NeAbKl8F7AlX:3d00V_AahZQ2m5dQ<mH1JTmml7Wol1ChOehZQD6d@QI3`KF<8ZcB76@nWbF!TTZn=P=7aebYIgmZJFdYea3Y86HRfRDGKMV41VEIF2pJfKL6:H`hAiC0O7Zo7QAnD65_MQh<QBIaRT0FdO^6Na=:HnDf>I@k7Mc=4NGlmmW9YHLTiS!J:fFIPED0jfKDCIYciKRDfi;o39C09<Qd<`N^pZm|hUWKFe4IG@N2B3N2kUNG^g3<NMcXDi_L07Zo>hEgNWcIEPm^_04n2:f|hEE0hWJ|!e4pFdgT","i believe this is solved"), 
		new Cipher("Test cipher by King/Bahler","ABCDEFGHIJKLEMNOPQRSDETUVBCHAJWXIDEYHGCUXZAVD0XB1WX2EFGKZ3PM10SKO4PTW2V1FBKFR3NIL2P53YMHZQJ1LLOL2FS0RLWGZXI6DV6BE302GKWXTZJ557MPSHOFDRT0ILM8CJ51V44OSHRIKUTUML3PJUDOSWF2N354THZRE021U4XIWXMDZXJ0KSW3BPGH", "believed to be solved"),
		/* kiuku's cipher, with ? replaced by | */
		new Cipher("Test cipher by kiuku", "*QFE8{<IC~8E9FQG>+#H[!}!Iy4\\D*I/&\\|3N4I:E=B@EA-D$$I::XJMVXB#\\F$I\\H$Z\\D!XMB=:I%AIVJK+Q4^*7-5W2J2DCA=\"EBIKGYABM|]0JK;I.&AY%FNYA=:I&9KK\\D$VB5GE-6A7>ECI\\KU;E\\XW\"DB<[CL$T|,NZH&EBVI[N^G{I>39@|35CYI\"#0+%U=Z1.D:u1>W/6YWB;EB/E%C\\E4!0A8TFB~\\E-EC=24\\IEA0=_KUZIB7NM4QVI{,1.*C@|6>$I>2FPQVHB;9H$IG$YE%6E;!33D#GVI;6EMVI*Z4U7L1\"$I^DEB=./F[S~>38SS","considerthisinonehandajarofincrediblyfreshtastinggreenmountaingringoinanotheratrumphofachievementthestrpnottobecmparedtoanyotherdippingutensilthestripwasinventedtogobeyondsturdyandreliabletoreachawholenewlevelovtastesatisfactionthisisthefirstchipworthyofourdelectablegreenmountaingrngosalsaallnanuralsourcofwholegranstheendthelitt"), 
		new Cipher("Test cipher by Michael Eaton", "kpP+tVH7Vz(;btYtWMJGLX.UtN%:JM/6Z3)Y!b5#TFB!_tVH#K%S8fCd7Et98>AR1QY2fQN1lLdEDW63X5Tp.GJlP)-Ctf1zdUOV_/4JZ(K;)Y+pl5TB/EXtKLESHV6!B!PptY%^3M(V&zk%RbF_H>CX93lW#LN+t<RLD:dCq.;bz1AH#GcU57f_DpR4HD-MZ/W6V!QN3_lGcZ;7)XtJM&EX%:U-<RdQYP+19S5C:tdGftJ7Mb;)NY(WE1Y3Z9YF8(./K&Tp)1S>Bdl+ttRttG;CK;#V)%:JZ(M88k;NY5W:FEZFCX(1q+PtUj#-V>XZJM^Ftt+3HMXFASXpK^+1","believed to be solved"),
		// ? replaced by |       http://zodiackiller.21.forumer.com/viewtopic.php?p=33105&sid=70bf22ece1661156d33d9a6925216082#33105     http://www.zodiackillerfacts.com/forum/viewtopic.php?p=23320#p23320
		/* mikec's 340-char cipher. ? replaced by |. */
		new Cipher("Test cipher by mikec", "I4X91iZg;`GJ=b=7[2j2fKG8OPEUH6B:dXFXLfXmaJJ0QdWATXPkKZUHkl@ZHnCK4[TJA0Qnnd[gnOSK6CM\\7[U0VL32G415Y4Y9[7KT[J=|dM9;`O5=kM8bK4_CfDT=m5G5IkY4VDFcWZB`TEFcXb67fKTJ9IQ25iVJ0|diZQ]hDLQ;A^ToMkK9[]XQgHX4THmJ]D1a4_K8J;10V_3Ua45onZG=5d^IVgW5iAhBACdWL;LD]GZQAa42GcPY[URpH:;AF[72dWBD2|D765i8KAO^K1cECdM6JeH|nI4JPD1jLbO0V^KN^kWeU0XVB:gdK0VLDgR=|fK92jN7kYAU", "inordertofacilitatetheanalysisofhomophonicciphersolversivewrittenascriptthattakestextasinputandgeneratesacipherofagivenlengthusingagivennumberofsymbolsthescriptgencipherplsupportsseveraloptionsincludingencodingusingstraightintegersorthepopularprintableasciiformattheoutputsgeneratedbythescriptincludeplaintextversionoftheinputciphertextvers"), 
		new Cipher("Test cipher from Nin (transposition cipher)","TJBRQAHGHJUQZBZKHYDSCTQOWFUWBDLZZKKSPHXNECTMQZOALMRXWLBUTHZTXHDTTCKBLDIVSOSLBQORLBQGVCRPOSLSTVTAIZUMGZKNMHECSJMNXJXZEJWHQLJPOWWESFWFWXCOKJJAYCWLNDHHENKAXXUOJCVSPMJEJWSOVYOHAKCKACPNIJQEVRJEVCUYYVIOIFZLBWLFCRGHNNANZUSQPJCLGUWGZAHHTIWFLLODAGCMAXHSHJFRDIQFMNMQTQYXUHQUNADBKJOBDDDOZKOBFDIBMQGMWTQBJXYSEGZMPJHZXXDMYWFVOAEAMCLXGVQHEXSOECUBRHIDDTWJ", null),
		/* 2: RayN cipher */
		new Cipher("Test cipher by RayN", "RzG_YW8#7FZZ5j+4MyB6VGTSQA2%tq1K)LXWCJY8>_ZT8#RxA/z2KI31yb=M@l/cYk7zYZWT_GAj#N3B*2=EK1zSZQ4+5Mjb_kRVGQJY#3xZK+%MVCJTW89_)tcnB>pN9#yAW6VG@)SEq*2kRKX7y+=5_DRk+3VGl4)kLbjCQ1yYF#c3%VFZKTxA)yNM8J26VB1)I@SWE=>Rzk_YR+P5MZ#F7yDTjA/qM24X1V3)GC*YDbkW%y+ZRk+ZV6)G8QTJA7KBnzS@W4q2lWC>1WMR/zDYFc3ZTWf8W33)klAtLIP2FB_1zZS#6fPY+N=M@/z%yktE9l5V/Wq*ZRKCQ3_L8jb#=KTA+cWG6x2IBJ13>n)GY_jN#xZyGTRVFA","believed to be solved"),
		// approximate solution due to some symbols representing more than one letter
		new Cipher("Test cipher by smithy", "D(_SrTTHW;E^DX+[Cn#)OQLDYymy$9ABfrj4r7#5GZyaST+NCFjMEPJW1%XV29YrD>AnzT-+QKC7#pNU];[\\DljPPCk%3)+_ZM<HTD8]f^BH%TEfmDLSPOXk$4Gn;N2Br]YDCD>AaQFE[(j7KrS#pNa%)M-_y3EHA]9L+DmZ#$MzCn#J%TUPTG2jQ#1EfD;[_5Yy]NFrA\\EV+)DrZ7M%SzC3f>TLW;<p[jX$HFrZGl)(mM+PC^jVrkz]>3fE4%9l25T81DOn_4EYEFPpQ^AH@LZa1$yWJUP8PrT;(GQ+B8%3V#2[mNTOf][DFEmnE)-iQ#CDm7M_Vy%N3rY\\El#S", "whenittartedwritingtonewspaperscliidingrespontibiriteformurdersiwasnothinkingaboutthweifficultiesthatwouldcautelawenforcedentbeciuswiwasonrethinkingaboutthepleasureiwasgetoingoutofteeingmelwtterspubrisheditwisntunoillaterthatireariseethatifididicoualledureertomwonedeserfandsavesomeproofofitthenicouldgetabtolutwreanethingiwantedpublisheegn"), 
		new Cipher("Test cipher from Thing of the Day", "VeXExA4WAuO<X{xEAeV[EMAV3[A[Vx!3EMMA2VMAX{x3E[AX]ApxVWAUVX<2O3pAX2x]{p2AUO3[]UMAW]{xEAU]3[ExO3pAOeAO4A]!VWAME<xEXMAMX]^E3Aex]4A[EEuAO3MO[EAX2EA[x{4AnEVXMA]{XA]eAXO4EGAMe", "solved"),
		new Cipher("Test cipher by Tony Baloney (1)","jfHQCHbc[GS`DlnMz[HKgaPH:VIbA2bG@Tz[HReWQU>H5k6GzY8QCH0HRi[BechjH^LmH9nS;]aHl=3KZHRDMHIJA1<:E@f4U]Y8F2g0cNmSVaXdbT<BOWQI;J>5i^HHA46kjGzh[9RLCH@=nlKGQM`5W1H3]8ifH0d^RkJ:Q2HHjmDW`UJlL0H^g`@4i6XeBGI5=Q:[fL3HKN;]YG^bMd=Q17|Ie8VQTmQ]Hcb[a9hSJSzb1i>Q1N|CmQ:E3<2GHR5@[F9XRz:7dcVWdIUe84RBNd<RkD]0e8<RKE09NOQl^[O=;4MnSTd1W7fzHChm9|R3jHSU1naA_3gBQBV0", "iamcompelledtokillmore&morepeopleallmyvictimswillbecomemyslavesimustmakethemostofmytimehereonearthbeforeenteringparadicethissummeriwillslaysomeskoolcidsiamthesameguywhocommittedthosemurdersinvallejolastmonthblupigscannevercatchmepleasehelpasicannotcontrolmyselfanylongerigetveryangrywitheveryoneandcouldstrikeagainalmostanytimetakeextracare"),
		// ? replaced by |
		new Cipher("Test cipher by Tony Baloney (2)",",CurN[|dISMT^yhvosdWSPFYwptc+gbfdBzOR`yA+0ZIG-VYa6+_C-UroLZD60Zfu4Jbsdq4{pikGFBJtTc:zS+:OS]mNjxlIJJWgu9vP[C,4Yy7UXr`hJsFclXfN@wtVRKTa8-NB_oDxZrZsUdliqXj4dIWn@JSdl9p,XT`kTU-UlFa[-zX@JhkYq+b@26gGRdfOyDpcA+Vi20ZBu,dE_oZbT^vjIGtT`C2ULZn*YW_PzufSU9rUo[sbZFTUWhw6BGRI_taD-qVrNisp+nmoWxFVjVtu9T`OE_,1n^oW[gYJrTy{CsHhaL]|cR_o-V+ZlDibTUdXjq-SgFZfzZl", "solved"),
		new Cipher("Test cipher by Unsub","BS—≈EZIπPE∑+MDº^£A∆–u∞∏KPÀ§TZBX∫Læ≈AGRÃµ∑∞H∆OKI^NVy+TJΩ√—EQÇ≈GFX∫Du∏º/§æI+–ÃLV∑ÀTπOµ‘∞√RPGÇKN\\yE√D≈PWπEƒΩ∆—P∏ºRI∫u∑∏∞∆§EB+yFæTK√πPMQ≈IÀ£‘Ã/B\\O∫G–N“R¢+yΩƒπ—AµTMDu§£X∆ºæJÀ∑µRGÇÃ∫DºONAÀy+Q∞∏W∆KΩ‘BEZ≈HVXPI—∫¢∆u§Aµ∑EWM£JπD–PBTRME\\Ç∞GKy∫ºπP∏∆æDº≈E“∑R+Q∞IVÃKOXÀ≈PN E∏Ω £TyBPG–∑+\\∞µDFMTJKEIº¢πP—ÀGµ/u≈√REƒ+£∑VBAD§X","solved"),
		new Cipher("Test cipher - Stage 3 Italian homophonic from Simon Singh's code challenge","IXDVMUFXLFEEFXSOQXYQVXSQTUIXWF*FMXYQVFJ*FXEFQUQXJFPTUFXMX*ISSFLQTUQXMXRPQEUMXUMTUIXYFSSFI*MXKFJF*FMXLQXTIEUVFXEQTEFXSOQXLQ*XVFWMTQTUQXTITXKIJ*FMUQXTQJMVX*QEYQVFQTHMXLFVQUVIXM*XEI*XLQ*XWITLIXEQTHGXJQTUQXSITEFLQVGUQX*GXKIEUVGXEQWQTHGXDGUFXTITXDIEUQXGXKFKQVXSIWQXAVPUFXWGXYQVXEQJPFVXKFVUPUQXQXSGTIESQTHGX*FXWFQFXSIWYGJTFXDQSFIXEFXGJPUFXSITXRPQEUGXIVGHFITXYFSSFI*CXC*XSCWWFTIXSOQXCXYQTCXYIESFCX*FXCKVQFXVFUQTPUFXQXKI*UCXTIEUVCXYIYYCXTQ*XWCUUFTIXLQFXVQWFXDCSQWWIXC*FXC*XDI**QXKI*IXEQWYVQXCSRPFEUCTLIXLC*X*CUIXWCTSFTIXUPUUQX*QXEUQ**QXJFCXLQX*C*UVIXYI*IXKQLQCX*CXTIUUQXQX*XTIEUVIXUCTUIXACEEIXSOQXTITXEPVJQCXDPIVXLQ*XWCVFTXEPI*IXSFTRPQXKI*UQXVCSSQEIXQXUCTUIXSCEEIX*IX*PWQXQVZXLFXEIUUIXLZX*ZX*PTZXYIFXSOQXTUVZUFXQVZKZWXTQX*Z*UIXYZEEIRPZTLIXTZYYZVKQXPTZXWITUZJTZXAVPTZXYQVX*ZXLFEUZTHZXQXYZVKQWFXZ*UZXUZTUIXRPZTUIXKQLPUZXTITXZKQZXZ*SPTZXTIFXSFXZ**QJVNWWIXQXUIEUIXUIVTIXFTXYFNTUIXSOQXLQX*NXTIKNXUQVVNXPTXUPVAIXTNSRPQXQXYQVSIEEQXLQ*X*QJTIXF*XYVFWIXSNTUIXUVQXKI*UQXF*XDQXJFVBVXSITXUPUUQX*BSRPQXBX*BXRPBVUBX*QKBVX*BXYIYYBXFTXEPEIXQX*BXYVIVBXFVQXFTXJFPXSIWB*UVPFXYFBSRPQFTDFTXSOQX*XWBVXDPXEIYVBXTIFXVFSOFPEIXX*BXYBVI*BXFTXSILFSQXQXQRPBUIV","i think this is solved"),

		// in all the Beale ciphers, ? is replaced by ¥
		new Cipher("Beale cipher #1", "!#$%&()*+,-./0123456789:;<.=>¥@ABC7DEFGHIJKLMNOPQRSTUV)WX;YZ[]^_`a-bcdefghijkl9mnopqFrIs3tuvwxycz@!{|}0U~]ĀāĂăĄuąĆ.ćSĈĉlĊċČr8čĎďĐđbĒ2r8ēĔĕĖėpZ:ĂĘęĚěĜĘĝĞğĠġĢ^ģĤĥyLĦħĨĩĪ.līĬĭĮįrăkİ@fı]Ĳĳ}ĴrĵIĶwķĸĹĺĻ¥ĪXļĽľ}ĿŀĩŁłŃńěŅņħŇň$c&!ŉŊŋŌō$ģĶ6ŎŏŐrőďŐŒœŔ:ŕ,|Ŗŗ[oŘřĆ]ŚśĥŜŝńylŞşŠ8ŎŖ,ĸšŉNŢţŎŤť8ŦŧŨũŪū:ŉŬŭ6Ů:ċyůĚ#ŰğtűŲĴĲfrĀkųŴŵŶŷŸoĺŹź$ŻżŽžƀƁƂƃŰ6Ƅ1ƅĚƆƇƈŉzĔĄLƉƊƋŖăZƌŖƍƆńŐĻƎƏ[ƐƑƒńƓ]0ƔģƑ2ĸŉƕƖ)ŜƗƘƙsƚĤƛƜRoƝĔźƞŉź!ƙƟƠơů~ƢyAŖĢŧƣƤƥ3ƦƔƧƨƩLū$Ƨƪš#~ƫƬƭƮrƯcưƱŖĲ.ƖĂWƲ0ĻHphŖ9]ŮƳ=ƴśD*)Ƶ&ƶ3ƷƸƹƺ/7ňĔƻ5Ř30đƄ0:ĸŞƼƽƾƿǀőńĔǁƯǂƖűǃǄǅǆǇǈQ2ŉƹǉǊęōŀĴm<!ǋƖǌįoōŻZ3ƺǍęǎ)ğǏ", null),
		new Cipher("Beale cipher #2", "!#$%&()*+,-./0123456789:;<=>¥(@ABCDEFGHIJKLMNO/PIL+QRS=7TUV1WXY&Z[]%$^_`2aB%bGcdefZIghiR)jklm#¥PnB=ophJqrstuvJwWx^yhIaz{J|}2~oT:!pĀhāR¥ĂF9ă1Y~ĄJNąĆć;3ĈĉĊ&ċXČič/PĎďĈāĐWđĒē,Ĕv&ă1%gĕ_ĖWwĒė5ĘmĊBēę4Ěv/ěfdĊĜyĝIfČāĆ(Ğğ<Ġ_ĉ6kĕġ!V3¥xaĢ3g2#8ĕ(L5UĔĖx=`8ģ^)5Yċ7nĤCĥĈĦħĨc0ĩĕĪĉī1Ę:;g!~#mīGąxv/(ĬĖ(iĭ&Ā%&Į`K90P`Ģ,!j%)Lįgğ+,İd¥x9J%g_ăĊıĞ&YW12¥Ĝ&)2Ĳy/VĞĳa2xĴĵĶķĸ0hĹ¥ĺēNuĊĻ/ĞĖ.ĭ/9^;JĖĐĸYCļ+9Ġ1ĽĆĚľĿŀWNĖĞıēę9ySĤĹL&(Ł2ľĠĞ%/Ėğ+S90PJ@ă+jłĸĕľ3ěĞc%gďGYľv&(XĕľĞ_~4Ĝ;/Nă#iĈŃāİj%ĞBoĀĠańgĎ¥{ĠaRĉĵ_2gx1ĖP.ŅJS}ġN9/ZĳĊņĖ~/:Fāĸ%hmģ]ĖāĮĈTdĔĜ172Ňĕx%XOSgňđŉı41ģ:¥gĕĜĊĈnĠD9(UAjćĬģVĉĊ/$ė`%&İā,ĞŊKvēj;ğŁ6ŋt0N9_vJYċJrŌl_ĜīōģĈĕ[J%gTāi#Ğ%ĬŎ{ĜfŏTJGuīc;{_Ė&(ĭŐmīĠiF2¥$Ė0Ĳ#g%¥eāĞćĥL&Ġ.+9āJc10Ġ^<Ė/đWįĬTĞ6Ĉ%hTēUĭőŉŒJd4ĚvŌğĬċ)LWSķœ/L`2¥xgāŊģ1ŔĐĥĉ#¥ĝZĬļiO<ĳņO_i;Ĉ@ıīĚ%oKŕdĶAĉĊX:YĿĹ_Ģ@16ŖOi;ĭİcjŗgīĔxŐĕI_9x12~1Ř", "I have deposited in the county of Bedford, about four miles from Buford's, in an excavation or vault, six feet below the surface of the ground, the following articles, belonging jointly to the parties whose names are given in number three, herewith: The first deposit consisted of ten hundred and fourteen pounds of gold, and thirty-eight hundred and twelve pounds of silver, deposited Nov. eighteen nineteen. The second was made Dec. eighteen twenty-one, and consisted of nineteen hundred and seven pounds of gold, and twelve hundred and eighty-eight of silver; also jewels, obtained in St. Louis in exchange for silver to save transportation, and valued at thirteen thousand dollars. The above is securely packed in iron pots, with iron covers. The vault is roughly lined with stone, and the vessels rest on solid stone, and are covered with others. Paper number one describes the exact locality of the vault, so that no difficulty will be had in finding it."),
		new Cipher("Beale cipher #3", "!#$%&()*+,-./0123456789:;<=>¥@ABCDEFGHIJKLM,NOPQGRST(UVI!+WXYZK[]^_`¥abcde`fRg+Rh4ieD-Nj:Vklam(no0,pqrK(sWht,E+uv<w.6vx48=y9Fz{G#B|J}~SĀ¥āĂăUhĄXNąĆćĈĉĊvċČčtĎJ:ď¥ĈjĐđ8Ēēr,Č=ĔUĕiĖPvėĖĘęjĚĀěhĜĊĝe¥RUĞğĕĠġĢA¥ģĤĥĦ,S+ħ*ĨĀLĩĪ@īwĬ%:>ĞĭĮįİıĲb@ĳvd-4ĴĵpVĶEķĸĹ+Tĺ-ĻļĽ]Ģľ8@#Ŀŀ~Łă<kĄy.MENSUłZOķđA($~<Ńđ,ĉERńŅL&Vņ^ŇňŉŊŋŌě;Rs(4ō.ŎŏFŐċőŒ#œmWdĢ@ŔŕŖŗŘqřŚśŜŝŞUş0<@=şkgŠv,šŢFXţZSŤJťČXŦŧŨŤħĀĿUeG¥(őĶ¥Ć,>KC3ĝĐčVũťj#ļYŪ[ūŬŭtŌďUgAĚGć@ZvĔŮF%(,ŀkJwůŰűqŲųŊŅŴŵŶiUŷŸ5qFykĉ@ĹXkŹţōŰźōtŻ9żĔSČŅ%$ŇFhůşŽ(,ĞžƀƁƂƃƄƅęƆăƇ,ƈĈF3ĳJjĺ;ĶĐLđ)ħčBƉġĢĖƊƋĊōJ`ƌƍƎƏƐƑĢƒU$őżXĳTĐz9&ŮƓmţťƔęƕbţƓqƕƖƗŝşƘĎƙƚƛűƜ@+SċĺĸFDƝ&<XğţƞŢƓũ&DŁdƟRDƜ=Ĝż,şĈĤ`[ƠơƢƣƤƔƥĚĳUTƦġůĆŤu8ĭƧĿqŌƨcƩƪƫƎƬƭ", null),
		new Cipher("BTK code", "GBSOAP7-TNLTRDEITBSFAV14", "VAGIAN - LET BEATTIE KNOW"),
		new Cipher("Copiale Cipher", CiphersCopiale.copiale, "solved"), 
		new Cipher("Copiale Cipher (newlines removed)", CiphersCopiale.copialeNoNewlines, "solved"),
		new Cipher("D'Agapeyeff cipher", "75628 28591 62916 48164 91748 58464 74748 28483 81638 18174 74826 26475 83828 49175 74658 37575 75936 36565 81638 17585 75756 46282 92857 46382 75748 38165 81848 56485 64858 56382 72628 36281 81728 16463 75828 16483 63828 58163 63630 47481 91918 46385 84656 48565 62946 26285 91859 17491 72756 46575 71658 36264 74818 28462 82649 18193 65626 48484 91838 57491 81657 27483 83858 28364 62726 26562 83759 27263 82827 27283 82858 47582 81837 28462 82837 58164 75748 58162 92000", null),
		new Cipher("Donna Lass poster cipher", "ePTWYPNWA[1WkSNZf22Q32ZZWkW[[","solved"),
		new Cipher("Dorabella cipher", "BPECAHTCKYFRQDRIRRHPPRDXYXGFSTRTHTCKLCERREHGQTRFRHUSQDXKKXFSESHUSEDUWGSERHUQSDCPGSHCDXC", null),
		//http://web.archive.org/web/20041029025822/http://rec-puzzles.org/new/sol.pl/cryptology/Feynman
		new Cipher("Feynman cipher 1 (solved)", "MEOTAIHSIBRTEWDGLGKNLANEAINOEEPEYSTNPEUOOEHRONLTIROSDHEOTNPHGAAETOHSZOTTENTKEPADLYPHEODOWCFORRRNLCUEEEEOPGMRLHNNDFTOENEALKEHHEATTHNMESCNSHIRAETDAHLHEMTETRFSWEDOEOENEGFHETAEDGHRLNNGOAAEOCMTURRSLTDIDOREHNHEHNAYVTIERHEENECTRNVIOUOEHOTRNWSAYIFSNSHOEMRTRREUAUUHOHOOHCDCHTEEISEVRLSKLIHIIAPCHRHSIHPSNWTOIISISHHNWEMTIEYAFELNRENLEERYIPHBEROTEVPHNTYATIERTIHEEAWTWVHTASETHHSDNGEIEAYNHHHNNHTW", "solved"),
		new Cipher("Feynman cipher 2 (unsolved)", "XUKEXWSLZJUAXUNKIGWFSOZRAWURORKXAOSLHROBXBTKCMUWDVPTFBLMKEFVWMUXTVTWUIDDJVZKBRMCWOIWYDXMLUFPVSHAGSVWUFWORCWUIDUJCNVTTBERTUNOJUZHVTWKORSVRZSVVFSQXOCMUWPYTRLGBMCYPOJCLRIYTVFCCMUWUFPOXCNMCIWMSKPXEDLYIQKDJWIWCJUMVRCJUMVRKXWURKPSEEIWZVXULEIOETOOFWKBIUXPXUGOWLFPWUSCH", null),
		new Cipher("Feynman cipher 3 (unsolved)", "WURVFXGJYTHEIZXSQXOBGSVRUDOOJXATBKTARVIXPYTMYABMVUFXPXKUJVPLSDVTGNGOSIGLWURPKFCVGELLRNNGLPYTFVTPXAJOSCWRODORWNWSICLFKEMOTGJYCRRAOJVNTODVMNSQIVICRBICRUDCSKXYPDMDROJUZICRVFWXIFPXIVVIEPYTDOIAVRBOOXWRAKPSZXTZKVROSWCRCFVEESOLWKTOBXAUXVB", null),
		// ? replaced by |
		new Cipher("Kryptos part 1 (solved)", "EMUFPHZLRFAXYUSDJKZLDKRNSHGNFIVJYQTQUXQBQVYUVLLTREVJYQTMKYRDMFD", "solved"),
		new Cipher("Kryptos part 2 (solved)", "VFPJUDEEHZWETZYVGWHKKQETGFQJNCEGGWHKK|DQMCPFQZDQMMIAGPFXHQRLGTIMVMZJANQLVKQEDAGDVFRPJUNGEUNAQZGZLECGYUXUEENJTBJLBQCRTBJDFHRRYIZETKZEMVDUFKSJHKFWHKUWQLSZFTIHHDDDUVH|DWKBFUFPWNTDFIYCUQZEREEVLDKFEZMOQQJLTTUGSYQPFEUNLAVIDXFLGGTEZ|FKZBSFDQVGOGIPUFXHHDRKFFHQNTGPUAECNUVPDJMQCLQUMUNEDFQELZZVRRGKFFVOEEXBDMVPNFQXEZLGREDNQFMPNZGLFLPMRJQYALMGNUVPDXVKPDQUMEBEDMHDAFMJGZNUPLGESWJLLAETG", "solved"),
		new Cipher("Kryptos part 3 (solved)", "ENDYAHROHNLSRHEOCPTEOIBIDYSHNAIACHTNREYULDSLLSLLNOHSNOSMRWXMNETPRNGATIHNRARPESLNNELEBLPIIACAEWMTWNDITEENRAHCTENEUDRETNHAEOETFOLSEDTIWENHAEIOYTEYQHEENCTAYCREIFTBRSPAMHHEWENATAMATEGYEERLBTEEFOASFIOTUETUAEOTOARMAEERTNRTIBSEDDNIAAHTTMSTEWPIEROAGRIEWFEBAECTDDHILCEIHSITEGOEAOSDDRYDLORITRKLMLEHAGTDHARDPNEOHMGFMFEUHEECDMRIPFEIMEHNLSSTTRTVDOHW", "solved"),
		new Cipher("Kryptos part 4 (unsolved)", "|OBKRUOXOGHULBSOLIFBBWFLRVQQPRNGKSSOTWTQSJQSSEKZZWATJKLUDIAWINFBNYPVTTMZFPKWGDKZXTJCDIGKUHUAUEKCAR", null),
		new Cipher("Michael D. Brown code", "GHUOORYHIIEEIYHIIXAHOJHOHAOOPHUHTHONHIYHIEEIHYHITHIIJHYHI", null),
		new Cipher("Ricky McCormick code", "MNDMKNEARSENSTAKNAREALSMTFRNENPINSENPBSERCBBNSENPRSEINCPRSENMRSEBPREHLDCNLDNCBETFXLFTCXLNCBEALPRPPITXLYPPIYNCBEMEKSEINCDRCBRNSEPRSEWLDRCBRNSENTSBNENTXSECRSLECITRSEWLDNCBEALWLPNCBETSMELRSERLSEURGLSNEASNWLDNCBENOPFSENLSRENCBENTEGDDMNSENCURERCBRNETENETFRNENCBRTSENCBEINCFLRSEPRSEDNDE71NCBECDNSEPRSEDNSDE74NCBEPRTSEPRSEONREDE75NCBETFNBCMSPSOLEMRDELUSETOTEWLDNINLDNCBE194WLDSNCBETRFXLALPNTEGLSESEERTEVLSEMTSECTSEWSEFRTSEPNRTRSEONPRSEWLDNCBENWLDXLRCMSPNEWLDSTSMEXLDULMT6TUNSENCBEXLMUNSARSTENMLNARSESAE6NSESENMBSENMNRCBRNSEPTE2PTEWSRCBRCSE26MLSE74SPRKSE29KENOBOLE175RTRSE35GLECLGSEOUNUTREDKRSEPSESHLE651MTCSEHTLSENCUTCTRSNMRE9984B2UNEPLSENCRSEAOLTSENSKSENRSENSREONSEPUTSEWLDNCBE3XARLANMSENRSEIN2NTRLERCBRNSENTSRCRBNELSPNSENGSPSEMKSERBSENCBEAUXLRHMCRENMRENCBE12MUNDDLSESWM4MILXDRLX", null),
		new Cipher("Tyler/Poe solved cipher 1 (See: http://www.bokler.com/eapoe.html)", ",Üß:á][,|á),[°∂|,Ü,)°,ß[∂¶,:∂![ß(,Üß°®(|Ö|,©©(ÖÖ°([,∂*.Ö[ß°∂ß°∂]ø,Üß[|(ß[::(Ü[.Ö(*;(®(,Üß°á[*:,]!∂Ü®]|©!∂ÖÜß∂®,©(Ü°(,|áß(°<°∂[|(,;ßá>á]Üßß:(Ü[Ü[∂|á]:*°∂:(ß|]!∂Üßá];ß|áÜ°áÖ∂!(,Üß|(®*][ß°`°,:,,Üß<),|®*]|,ßß(!Ö°(,ÜßÜ[á!)*][Ö:|]®", "solved"),
		new Cipher("Taman Shud code", "WRGOABABDWTBIMPANETPMLIABOAIAQCITTMTSAMSTGAB", null),
		new Cipher("Voynich manuscript", CiphersVoynich.voynich, null),
		new Cipher("Voynich manuscript (whitespace removed)", CiphersVoynich.voynichNoWhitespace, null),
		new Cipher("Zodiac 'copycat' cipher as found on Ed Neil's website", "*-ú*+á§´H-å£úëáå£áŒ-=ƒ +»£å=*»´òú*´ë™á-£å=*ú*´ëŒ-ºº-=ƒú*´ëº-ú*á=-=ƒ*ë+´=»ú-Ã*+-ú-ú=´*´=*+áÃ]´=Tëåƒá-=å ááŒ- -ººúŒ-=3º-**ºáŒ-Húå=H™åŒáåúò-*Ã]´™*+áúŒ-=", "solved"),
		// ? replaced by |
		new Cipher("Z408: Zodiac killer's solved 408 cipher, false positive high-scoring merge [KTWz]","9%P/Z/UB%kOR=pX=BKV+eGYF69HP@K!qYeMJY^UIk7qKtNQYD5)S(/9#BPORAU%fRlqEk^LMZJdr\\pFHVKe8Y@+qGD9KI)6qX85KS(RNtIYElO8qGBKQS#BLd/P#B@XqEHMU^RRkcZKqpI)Kq!85LMr9#BPDR+j=6\\N(eEUHkFZcpOVKI5+tL)l^R6HI9DR_KYr\\de/@XJQAP5M8RUt%L)NVEKH=GrI!Jk598LMlNA)Z(PKUpkA9#BVK\\+VKtOP^=SrlfUe67DKG%%IMNk)ScE/9%%ZfAP#BVpeXqKq_F#8c+@9A9B%OK5RUc+_dYq_^SqKVZeGYKE_KYA9%#Lt_H!FBX9KXADd\\7L!=q_ed##6e5PORXQF%GcZ@JKtq_8JI+rBPQK6VEXr9KI6qEHM)=UIk",Z408_SOLUTION),
		new Cipher("Z408: Zodiac killer's solved 408 cipher, false positive high-scoring merge [Tj]","9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!qYeMJY^UIk7qTtNQYD5)S(/9#BPORAU%fRlqEk^LMZJdr\\pFHVWe8Y@+qGD9KI)6qX85zS(RNtIYElO8qGBTQS#BLd/P#B@XqEHMU^RRkcZKqpI)Wq!85LMr9#BPDR+T=6\\N(eEUHkFZcpOVWI5+tL)l^R6HI9DR_TYr\\de/@XJQAP5M8RUt%L)NVEKH=GrI!Jk598LMlNA)Z(PzUpkA9#BVW\\+VTtOP^=SrlfUe67DzG%%IMNk)ScE/9%%ZfAP#BVpeXqWq_F#8c+@9A9B%OT5RUc+_dYq_^SqWVZeGYKE_TYA9%#Lt_H!FBX9zXADd\\7L!=q_ed##6e5PORXQF%GcZ@JTtq_8JI+rBPQW6VEXr9WI6qEHM)=UIk",Z408_SOLUTION),
		new Cipher("Z408: Zodiac killer's solved 408 cipher, false positive high-scoring merge [%fjq]","9%P/Z/UB%kOR=pX=BWV+eGYF69HP@K!%YeMJY^UIk7%TtNQYD5)S(/9#BPORAU%%Rl%Ek^LMZJdr\\pFHVWe8Y@+%GD9KI)6%X85zS(RNtIYElO8%GBTQS#BLd/P#B@X%EHMU^RRkcZK%pI)W%!85LMr9#BPDR+%=6\\N(eEUHkFZcpOVWI5+tL)l^R6HI9DR_TYr\\de/@XJQAP5M8RUt%L)NVEKH=GrI!Jk598LMlNA)Z(PzUpkA9#BVW\\+VTtOP^=Srl%Ue67DzG%%IMNk)ScE/9%%Z%AP#BVpeX%W%_F#8c+@9A9B%OT5RUc+_dY%_^S%WVZeGYKE_TYA9%#Lt_H!FBX9zXADd\\7L!=%_ed##6e5PORXQF%GcZ@JTt%_8JI+rBPQW6VEXr9WI6%EHM)=UIk",Z408_SOLUTION),
		new Cipher("Celebrity Cypher", "zRO1+ dI^2Y3lp IZY+FBI>c+ O<YL>4F, B5 V6 W73 Y89M M!@# Md z$Mp Iq", null)
		
	};

	public static String alphabet408 = "ABDEFGHIJKLMNOPQRSTUVWXYZ56789cdefjklpqrtz!#%()=+/@\\^_";
	public static String decoder408 = "wlnesattfsthenifgaoibeouetesaivocdxiaemrrdollnhpeksrny";
	public static Map<Character, Character> decoderMap;
	static {
		decoderMap = new HashMap<Character, Character>();
		for (int i=0; i<alphabet408.length(); i++) {
			decoderMap.put(alphabet408.charAt(i), decoder408.charAt(i));
		}
	}
	
	/* cosine similarities */
	public static CosineSimilarity c = new CosineSimilarity();
	public static List<CosineSimilarityResult> cosineSimilarities; // list of all similarities
	public static Map<String, Float> cosineSimilaritiesMap;
	
	public static void initCS() {
		cosineSimilaritiesMap = new HashMap<String, Float>();
		cosineSimilarities = c.compute(cipher[which].cipher, false);
		int count=0;
		for (CosineSimilarityResult r : cosineSimilarities) {
			cosineSimilaritiesMap.put(r.key, r.val);
			cosineSimilaritiesMap.put(""+r.key.charAt(1)+r.key.charAt(0), r.val); // the equivalent reverse, for convenience
		}
	}

	
	/* the Zodiac alphabets */
	public static final String[] alphabet = {
		"ABCDEFGH|JKLMNOPRSTUVWXYZ123456789plkdfycjqbtz()>^+.<-/#_@*%&;:",
		"ABDEFGHIJKLMNOPQRSTUVWXYZ56789cdefjklpqrtz!#%()=+/@\\^_",
		"#%)*+/123456789=>@ABCDEFGIJKLMNPQRSTVWXYZ_bcfjklnpqtxyz"
		//"ABDEFGHIJKLMNOPQRSTUVWXYZ56789defklpqrtz!#%()*+/@\\^", // alphabet for 100 char subset of solved cipher
		//"BCDEFGHIJKLMNOPRSTUVWYZ12345789cdfjklptyz#%&()+-./:<>\\^_", // alphabet for 100 char subset of unsolved cipher
		//"ABEFGKORSTUVWXYZ589cdepq#%+@^_", // alphabet for the 51 chars of the 408
		//null
	};
	public static HashMap<Character, Integer> alphabetHash; // used to speed up the getDecoderForWordAtPosition method.
	
	/* known solutions (as decoders) */
	public static final String[] solutions = {
		"UNKNOWN", // 63 chars
	 //ABDEFGHIJKLMNOPQRSTUVWXYZ56789cdefklpqrtz!#$%()*+/@\^_
		"wlnesattfsthenifgaoibeouetesaivocdxiaemrrdollnhpeksrny" // 54 chars
		//"wlnesattfsthenifgaoibeouetesaiocdiaemrrdollhnpeksrn",
		//null,
		//"wlesasngaoibeouetaivocemllesny", // the 30 chars of the 54
	};
	
	public static void dumpCiphers(String path) {
		for (int i=0; i<cipher.length; i++) {
			FileUtil.writeText(path + "/cipher_" + i + ".txt", cipher[i].cipher);
		}
	}
	
	/** get the cipher using the given description */
	public static Cipher cipherByDescription(String description) {
		for (Cipher c : cipher)
			if (description.equalsIgnoreCase(c.description)) return c;
		return null;
	}
	
	/* known solutions (full text) */
	public static final String[] solutionsFull = {
		"UNKNOWN",
		"ilikekillingpeoplebecauseitissomuchfunitismorefunthankillingwildgameintheforrestbecausemanisthemoatdangertueanamalofalltokillsomethinggivesmethemoatthrillingexperenceitisevenbetterthangettingyourrocksoffwithagirlthebestpartofitiathaewhenidieiwillbereborninparadicesndalltheihavekilledwillbecomemyslavesiwillnotgiveyoumynamebecauseyouwilltrytosloidownorstopmycollectingofslavesformyafterlifeebeorietemethhpiti"
	};
	

	/** convert one-line cipher into grid form with the given width */
	public static String[] grid(String text, int width) {
		int rows = text.length() / width;
		int rem = text.length() % width;
		if (rem > 0) rows++;
		String[] grid = new String[rows];
		for (int i=0; i<rows; i++)
			grid[i] = text.substring(i*width, i*width+width);
		return grid;
	}
	
	/** returns true if each symbol in the given string translates to the same plaintext letter in the 408 cipher */
	public static boolean realHomophone(String str) {
		Set<Character> set = new HashSet<Character>();
		for (int i=0; i<str.length(); i++) {
			Character ch = decoderMap.get(str.charAt(i));
			set.add(ch);
		}
		return set.size() == 1;
	}
	
	/** derive the cipher alphabet, in sorted order, from the given cipher text */ 
	public static String alphabet(String cipher) {
		Set<Character> set = new TreeSet<Character>();
		for (int i=0; i<cipher.length(); i++) {
			//if (cipher.charAt(i) == ' ') continue; // ignore spaces
			//if (cipher.charAt(i) == '	') continue; // ignore tabs
			set.add(cipher.charAt(i));
		}
		StringBuffer sb = new StringBuffer();
		for (Character c : set) sb.append(c);
		return sb.toString();
		
	}

	/** derive the cipher alphabet, in sorted order, from the given cipher text */ 
	public static List<Character> alphabetAsList(String cipher) {
		Set<Character> set = new TreeSet<Character>();
		for (int i=0; i<cipher.length(); i++) {
			set.add(cipher.charAt(i));
		}
		return new ArrayList<Character>(set);
	}

	/** return a map of symbol counts for the given cipher text */
	public static Map<Character, Integer> countMap(String str) {
		Map<Character, Integer> symbolCounts = new HashMap<Character, Integer>();
		if (str == null) return symbolCounts;
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			Integer val = symbolCounts.get(ch);
			if (val == null) val = 0;
			val++;
			symbolCounts.put(ch, val);
		}
		return symbolCounts;
		
	}

	
	public static void testAlphabet() {
		System.out.println(cipher[0]);
		System.out.println(alphabet(cipher[0].cipher));
		System.out.println(cipher[1]);
		System.out.println(alphabet(cipher[1].cipher));
	}
	
	public static void main(String[] args) {
		//testAlphabet();
		//test10s();
		
		/*
		Cipher c = cipher[cipher.length-1];
		System.out.println(c);
		String line = "";
		for (int i=0; i<c.cipher.length(); i++) {
			line += "[" + c.cipher.charAt(i) + "]";
		}
		System.out.println(line);*/
		/*for (int i=0; i<cipher.length; i++) {
			System.out.println(cipher[i].cipher);
			char[] c = cipher[i].cipher.toCharArray();
			System.out.println(String.valueOf(c));
		}*/
		dumpCiphers("/Users/doranchak/projects/work/java/zodiac");
		
		//char[] c = cipher[cipher.length-1].cipher.toCharArray();
		//for (int i=0; i<c.length; i++) System.out.println(c[i]);
		                  
	}
	
	
	

}
