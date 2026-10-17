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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WineBarKt {
    private static ImageVector _wineBar;

    public static final ImageVector getWineBar(Icons.Sharp sharp) {
        ImageVector imageVector = _wineBar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WineBar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(6.0f, 3.0f, 0.0f, 6.0f);
        e.curveToRelative(0.0f, 2.97f, 2.16f, 5.43f, 5.0f, 5.91f);
        bv.A(e, 19.0f, 8.0f, 2.0f, 8.0f);
        kf0.z(e, -2.0f, -3.0f, -4.09f);
        e.curveToRelative(2.84f, -0.48f, 5.0f, -2.94f, 5.0f, -5.91f);
        gy.w(e, 0.0f, -6.0f, 6.0f);
        e.moveTo(16.0f, 8.0f);
        uo.g(e, 8.0f, 0.0f, -3.0f, 8.0f);
        e.curveTo(16.0f, 5.0f, 16.0f, 8.0f, 16.0f, 8.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wineBar = build;
        build.getClass();
        return build;
    }
}
