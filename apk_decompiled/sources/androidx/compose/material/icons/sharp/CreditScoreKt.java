package androidx.compose.material.icons.sharp;

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
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CreditScoreKt {
    private static ImageVector _creditScore;

    public static final ImageVector getCreditScore(Icons.Sharp sharp) {
        ImageVector imageVector = _creditScore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CreditScore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(2.0f, 4.0f, 16.0f, 7.0f, -2.0f);
        af0.g(s, 4.0f, -6.0f, 18.0f, 4.0f);
        kp0.B(s, 2.0f, 20.0f, 8.0f, 4.0f);
        c21.c(s, 6.0f, 16.0f, 8.0f);
        s.moveTo(14.93f, 19.17f);
        s.lineToRelative(-2.83f, -2.83f);
        s.lineToRelative(-1.41f, 1.41f);
        s.lineTo(14.93f, 22.0f);
        s.lineTo(22.0f, 14.93f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(s, -1.41f, -1.41f, 14.93f, 19.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _creditScore = build;
        build.getClass();
        return build;
    }
}
