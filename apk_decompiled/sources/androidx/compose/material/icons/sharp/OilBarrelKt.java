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
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OilBarrelKt {
    private static ImageVector _oilBarrel;

    public static final ImageVector getOilBarrel(Icons.Sharp sharp) {
        ImageVector imageVector = _oilBarrel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.OilBarrel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(21.0f, 13.0f, -2.0f, -2.0f, 5.0f);
        af0.p(w, 2.0f, 3.0f, 3.0f, 2.0f);
        af0.z(w, 2.0f, 6.0f, 3.0f, 2.0f);
        af0.z(w, 2.0f, 6.0f, 3.0f, 2.0f);
        af0.v(w, 18.0f, -2.0f, -2.0f, -6.0f);
        k4.w(w, 21.0f, 12.0f, 16.0f);
        w.curveToRelative(-1.66f, 0.0f, -3.0f, -1.32f, -3.0f, -2.95f);
        w.curveToRelative(0.0f, -1.3f, 0.52f, -1.67f, 3.0f, -4.55f);
        w.curveToRelative(2.47f, 2.86f, 3.0f, 3.24f, 3.0f, 4.55f);
        w.curveTo(15.0f, 14.68f, 13.66f, 16.0f, 12.0f, 16.0f);
        w.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, w.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _oilBarrel = build;
        build.getClass();
        return build;
    }
}
