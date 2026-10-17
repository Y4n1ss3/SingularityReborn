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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CellWifiKt {
    private static ImageVector _cellWifi;

    public static final ImageVector getCellWifi(Icons.Filled filled) {
        ImageVector imageVector = _cellWifi;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CellWifi", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(18.0f, 9.98f, 6.0f, 22.0f, 12.0f);
        uf.w(k, 4.0f, 5.97f, 18.0f, 9.98f);
        k4.C(k, 20.0f, 20.0f, -2.0f, -7.22f);
        uf.x(k, 2.0f, -2.0f, 20.0f);
        k.moveTo(5.22f, 7.22f);
        k.lineTo(3.93f, 5.93f);
        k.curveToRelative(3.9f, -3.91f, 10.24f, -3.91f, 14.15f, 0.0f);
        k.lineToRelative(-1.29f, 1.29f);
        k.curveTo(13.6f, 4.03f, 8.41f, 4.03f, 5.22f, 7.22f);
        k4.r(k, 12.93f, 11.07f, 11.0f, 13.0f);
        k.lineToRelative(-1.93f, -1.93f);
        k.curveTo(10.14f, 10.01f, 11.86f, 10.01f, 12.93f, 11.07f);
        k.close();
        k.moveTo(14.22f, 9.79f);
        k.curveToRelative(-1.78f, -1.77f, -4.66f, -1.77f, -6.43f, 0.0f);
        k.lineTo(6.5f, 8.5f);
        k.curveToRelative(2.48f, -2.48f, 6.52f, -2.48f, 9.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(k, 14.22f, 9.79f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cellWifi = build;
        build.getClass();
        return build;
    }
}
