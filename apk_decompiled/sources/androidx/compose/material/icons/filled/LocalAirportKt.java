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
import defpackage.bv;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalAirportKt {
    private static ImageVector _localAirport;

    public static final ImageVector getLocalAirport(Icons.Filled filled) {
        ImageVector imageVector = _localAirport;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocalAirport", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(22.0f, 16.0f, -2.0f, -8.5f, -5.0f);
        n.verticalLineTo(3.5f);
        n.curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f);
        n.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        n.verticalLineTo(9.0f);
        n.lineTo(2.0f, 14.0f);
        n.verticalLineToRelative(2.0f);
        n.lineToRelative(8.5f, -2.5f);
        n.verticalLineTo(19.0f);
        n.lineTo(8.0f, 20.5f);
        n.lineTo(8.0f, 22.0f);
        n.lineToRelative(4.0f, -1.0f);
        n.lineToRelative(4.0f, 1.0f);
        n.lineToRelative(0.0f, -1.5f);
        n.lineTo(13.5f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(n, -5.5f, 22.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localAirport = build;
        build.getClass();
        return build;
    }
}
