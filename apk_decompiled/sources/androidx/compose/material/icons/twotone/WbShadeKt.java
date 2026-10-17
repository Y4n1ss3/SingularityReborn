package androidx.compose.material.icons.twotone;

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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbShadeKt {
    private static ImageVector _wbShade;

    public static final ImageVector getWbShade(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wbShade;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WbShade", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(14.0f, 12.0f, 2.5f, 5.5f, 5.5f);
        kf0.m(n, 22.0f, 14.0f, 12.0f);
        n.moveTo(14.0f, 20.0f);
        n.horizontalLineToRelative(3.0f);
        n.lineToRelative(-3.0f, -3.0f);
        n.verticalLineTo(20.0f);
        n.close();
        n.moveTo(8.0f, 4.0f);
        r6.q(n, -6.0f, 6.0f, 2.0f, 10.0f);
        af0.f(n, 8.0f, 10.0f, 2.0f);
        uo.l(n, 8.0f, 4.0f, 9.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.e(n, 7.0f, -4.0f, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbShade = build;
        build.getClass();
        return build;
    }
}
