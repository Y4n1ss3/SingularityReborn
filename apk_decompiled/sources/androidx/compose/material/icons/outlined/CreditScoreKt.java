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
import defpackage.af0;
import defpackage.c21;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CreditScoreKt {
    private static ImageVector _creditScore;

    public static final ImageVector getCreditScore(Icons.Outlined outlined) {
        ImageVector imageVector = _creditScore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CreditScore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.89f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f);
        d.lineTo(2.0f, 18.0f);
        d.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        af0.z(d, 5.0f, -2.0f, 4.0f, -6.0f);
        d.horizontalLineToRelative(18.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.89f, 21.11f, 4.0f, 20.0f, 4.0f);
        c21.d(d, 20.0f, 8.0f, 4.0f, 6.0f);
        uo.r(d, 16.0f, 8.0f, 14.93f, 19.17f);
        d.lineToRelative(-2.83f, -2.83f);
        d.lineToRelative(-1.41f, 1.41f);
        d.lineTo(14.93f, 22.0f);
        d.lineTo(22.0f, 14.93f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, -1.41f, -1.41f, 14.93f, 19.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _creditScore = build;
        build.getClass();
        return build;
    }
}
