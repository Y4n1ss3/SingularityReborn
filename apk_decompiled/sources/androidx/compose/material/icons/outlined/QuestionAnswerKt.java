package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QuestionAnswerKt {
    private static ImageVector _questionAnswer;

    public static final ImageVector getQuestionAnswer(Icons.Outlined outlined) {
        ImageVector imageVector = _questionAnswer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.QuestionAnswer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(15.0f, 4.0f, 7.0f, 5.17f, 11.0f);
        y.lineToRelative(-0.59f, 0.59f);
        y.lineToRelative(-0.58f, 0.58f);
        y.lineTo(4.0f, 4.0f);
        y.horizontalLineToRelative(11.0f);
        y.moveToRelative(1.0f, -2.0f);
        y.lineTo(3.0f, 2.0f);
        y.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        r6.h(y, 14.0f, 4.0f, -4.0f, 10.0f);
        y.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        y.lineTo(17.0f, 3.0f);
        y.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        r6.B(y, 21.0f, 6.0f, -2.0f, 9.0f);
        y.lineTo(6.0f, 15.0f);
        y.verticalLineToRelative(2.0f);
        y.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        y.horizontalLineToRelative(11.0f);
        y.lineToRelative(4.0f, 4.0f);
        y.lineTo(22.0f, 7.0f);
        y.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        y.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, y.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _questionAnswer = build;
        build.getClass();
        return build;
    }
}
