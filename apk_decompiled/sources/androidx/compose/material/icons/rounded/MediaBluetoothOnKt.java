package androidx.compose.material.icons.rounded;

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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediaBluetoothOnKt {
    private static ImageVector _mediaBluetoothOn;

    public static final ImageVector getMediaBluetoothOn(Icons.Rounded rounded) {
        ImageVector imageVector = _mediaBluetoothOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MediaBluetoothOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.0f, 5.0f, 0.01f, 8.55f);
        e.curveToRelative(-0.6f, -0.34f, -1.28f, -0.55f, -2.0f, -0.55f);
        e.curveTo(4.79f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f);
        e.reflectiveCurveToRelative(1.79f, 4.0f, 4.01f, 4.0f);
        e.reflectiveCurveTo(11.0f, 19.21f, 11.0f, 17.0f);
        e.verticalLineTo(7.0f);
        e.horizontalLineToRelative(2.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-2.0f);
        e.curveTo(9.9f, 3.0f, 9.0f, 3.9f, 9.0f, 5.0f);
        k4.x(e, 20.29f, 11.72f, -2.47f, -2.47f);
        e.curveToRelative(-0.32f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f);
        e.verticalLineToRelative(3.94f);
        e.lineToRelative(-2.33f, -2.33f);
        e.curveToRelative(-0.23f, -0.23f, -0.61f, -0.23f, -0.85f, 0.0f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(-0.23f, 0.23f, -0.23f, 0.62f, 0.0f, 0.85f);
        e.lineTo(16.73f, 15.0f);
        e.lineToRelative(-2.93f, 2.93f);
        e.curveToRelative(-0.23f, 0.23f, -0.23f, 0.61f, 0.0f, 0.85f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(0.23f, 0.23f, 0.61f, 0.23f, 0.85f, 0.0f);
        e.lineToRelative(2.33f, -2.33f);
        e.verticalLineToRelative(3.94f);
        e.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        e.lineToRelative(2.46f, -2.46f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        e.lineTo(18.42f, 15.0f);
        e.lineToRelative(1.87f, -1.86f);
        e.curveTo(20.68f, 12.75f, 20.68f, 12.11f, 20.29f, 11.72f);
        k4.x(e, 18.17f, 11.3f, 1.13f, 1.13f);
        uf.x(e, -1.13f, 1.13f, 11.3f);
        e.moveTo(19.3f, 17.57f);
        e.lineToRelative(-1.13f, 1.13f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(e, -2.26f, 19.3f, 17.57f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediaBluetoothOn = build;
        build.getClass();
        return build;
    }
}
