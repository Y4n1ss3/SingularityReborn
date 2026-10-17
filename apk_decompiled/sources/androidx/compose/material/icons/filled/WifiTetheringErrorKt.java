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
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiTetheringErrorKt {
    private static ImageVector _wifiTetheringError;

    public static final ImageVector getWifiTetheringError(Icons.Filled filled) {
        ImageVector imageVector = _wifiTetheringError;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WifiTetheringError", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.0f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        b.curveToRelative(0.0f, 1.66f, 0.68f, 3.15f, 1.76f, 4.24f);
        b.lineToRelative(1.42f, -1.42f);
        b.curveTo(8.45f, 15.1f, 8.0f, 14.11f, 8.0f, 13.0f);
        b.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 1.11f, -0.45f, 2.1f, -1.18f, 2.82f);
        b.lineToRelative(1.42f, 1.42f);
        b.curveTo(17.32f, 16.15f, 18.0f, 14.66f, 18.0f, 13.0f);
        b.curveTo(18.0f, 9.69f, 15.31f, 7.0f, 12.0f, 7.0f);
        b.close();
        b.moveTo(12.0f, 3.0f);
        b.curveTo(6.48f, 3.0f, 2.0f, 7.48f, 2.0f, 13.0f);
        b.curveToRelative(0.0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f);
        b.lineToRelative(1.42f, -1.42f);
        b.curveTo(4.9f, 17.21f, 4.0f, 15.21f, 4.0f, 13.0f);
        b.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        b.curveToRelative(2.53f, 0.0f, 4.78f, 1.17f, 6.24f, 3.0f);
        b.horizontalLineToRelative(2.42f);
        b.curveTo(18.93f, 5.01f, 15.7f, 3.0f, 12.0f, 3.0f);
        b.close();
        b.moveTo(12.0f, 11.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f);
        b.curveTo(10.95f, 14.77f, 11.45f, 15.0f, 12.0f, 15.0f);
        b.reflectiveCurveToRelative(1.05f, -0.23f, 1.41f, -0.59f);
        b.curveTo(13.77f, 14.05f, 14.0f, 13.55f, 14.0f, 13.0f);
        b.curveTo(14.0f, 11.9f, 13.1f, 11.0f, 12.0f, 11.0f);
        r6.B(b, 20.0f, 10.0f, 2.0f, 6.0f);
        uo.r(b, -2.0f, 10.0f, 20.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(b, 2.0f, 2.0f, -2.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiTetheringError = build;
        build.getClass();
        return build;
    }
}
