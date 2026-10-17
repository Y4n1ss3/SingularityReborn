package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FastfoodKt {
    private static ImageVector _fastfood;

    public static final ImageVector getFastfood(Icons.Filled filled) {
        ImageVector imageVector = _fastfood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Fastfood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(18.06f, 22.99f, 1.66f);
        a.curveToRelative(0.84f, 0.0f, 1.53f, -0.64f, 1.63f, -1.46f);
        a.lineTo(23.0f, 5.05f);
        uo.n(a, -5.0f, 18.0f, 1.0f, -1.97f);
        gy.C(a, 4.05f, -4.97f, 0.3f, 2.34f);
        a.curveToRelative(1.71f, 0.47f, 3.31f, 1.32f, 4.27f, 2.26f);
        a.curveToRelative(1.44f, 1.42f, 2.43f, 2.89f, 2.43f, 5.29f);
        r6.l(a, 8.05f, 1.0f, 21.99f);
        fc.w(a, 1.0f, 21.0f, 15.03f, 0.99f);
        a.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.01f, 1.0f);
        a.lineTo(2.01f, 22.99f);
        a.curveToRelative(-0.56f, 0.0f, -1.01f, -0.45f, -1.01f, -1.0f);
        a.close();
        a.moveTo(16.03f, 14.99f);
        a.curveToRelative(0.0f, -8.0f, -15.03f, -8.0f, -15.03f, 0.0f);
        kp0.A(a, 15.03f, 1.02f, 17.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(a, 2.0f, -15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastfood = build;
        build.getClass();
        return build;
    }
}
