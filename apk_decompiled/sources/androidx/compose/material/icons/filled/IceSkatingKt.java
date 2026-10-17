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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IceSkatingKt {
    private static ImageVector _iceSkating;

    public static final ImageVector getIceSkating(Icons.Filled filled) {
        ImageVector imageVector = _iceSkating;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.IceSkating", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 8.5f);
        b.curveTo(8.0f, 8.22f, 8.22f, 8.0f, 8.5f, 8.0f);
        kf0.A(b, 2.52f, 11.0f, 7.0f, 8.5f);
        b.curveTo(8.22f, 7.0f, 8.0f, 6.78f, 8.0f, 6.5f);
        b.curveTo(8.0f, 6.22f, 8.22f, 6.0f, 8.5f, 6.0f);
        gy.x(b, 11.0f, 3.0f, 3.0f, 15.0f);
        af0.z(b, 3.0f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        kf0.x(b, -2.0f, -2.0f, 3.0f);
        b.lineToRelative(0.0f, -2.88f);
        b.curveToRelative(0.0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f);
        b.lineToRelative(-2.7f, -0.67f);
        b.curveTo(12.4f, 10.35f, 11.7f, 9.76f, 11.32f, 9.0f);
        b.horizontalLineTo(8.5f);
        b.curveTo(8.22f, 9.0f, 8.0f, 8.78f, 8.0f, 8.5f);
        uo.q(b, 14.0f, 20.0f, 8.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 6.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iceSkating = build;
        build.getClass();
        return build;
    }
}
