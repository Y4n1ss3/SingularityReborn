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
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CellWifiKt {
    private static ImageVector _cellWifi;

    public static final ImageVector getCellWifi(Icons.Sharp sharp) {
        ImageVector imageVector = _cellWifi;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CellWifi", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(6.0f, 22.0f, 16.0f, 5.97f);
        uo.l(e, 6.0f, 22.0f, 20.0f, 20.0f);
        bv.p(e, -2.0f, -7.22f, 2.0f, -2.0f);
        bv.t(e, 20.0f, 5.22f, 7.22f);
        e.lineTo(3.93f, 5.93f);
        e.curveToRelative(3.9f, -3.91f, 10.24f, -3.91f, 14.15f, 0.0f);
        e.lineToRelative(-1.29f, 1.29f);
        e.curveTo(13.6f, 4.03f, 8.41f, 4.03f, 5.22f, 7.22f);
        k4.r(e, 12.93f, 11.07f, 11.0f, 13.0f);
        e.lineToRelative(-1.93f, -1.93f);
        e.curveTo(10.14f, 10.01f, 11.86f, 10.01f, 12.93f, 11.07f);
        e.close();
        e.moveTo(14.22f, 9.79f);
        e.curveToRelative(-1.78f, -1.77f, -4.66f, -1.77f, -6.43f, 0.0f);
        e.lineTo(6.5f, 8.5f);
        e.curveToRelative(2.48f, -2.48f, 6.52f, -2.48f, 9.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 14.22f, 9.79f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cellWifi = build;
        build.getClass();
        return build;
    }
}
