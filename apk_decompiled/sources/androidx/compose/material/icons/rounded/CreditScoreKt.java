package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CreditScoreKt {
    private static ImageVector _creditScore;

    public static final ImageVector getCreditScore(Icons.Rounded rounded) {
        ImageVector imageVector = _creditScore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CreditScore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.89f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f);
        d.lineTo(2.0f, 18.0f);
        d.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(4.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        af0.g(d, 4.0f, -6.0f, 18.0f, 6.0f);
        d.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        c21.d(d, 20.0f, 8.0f, 4.0f, 6.0f);
        uo.r(d, 16.0f, 8.0f, 14.93f, 19.17f);
        d.lineToRelative(-2.12f, -2.12f);
        d.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        d.lineToRelative(2.83f, 2.83f);
        d.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        d.lineToRelative(5.66f, -5.66f);
        d.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 14.93f, 19.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _creditScore = build;
        build.getClass();
        return build;
    }
}
