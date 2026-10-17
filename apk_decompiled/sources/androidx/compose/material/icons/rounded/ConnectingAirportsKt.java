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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConnectingAirportsKt {
    private static ImageVector _connectingAirports;

    public static final ImageVector getConnectingAirports(Icons.Rounded rounded) {
        ImageVector imageVector = _connectingAirports;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ConnectingAirports", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.93f, 10.6f);
        b.curveToRelative(0.39f, 0.0f, 0.66f, 0.37f, 0.55f, 0.74f);
        b.lineTo(15.4f, 15.0f);
        b.horizontalLineToRelative(2.85f);
        b.lineToRelative(0.59f, -0.78f);
        b.curveToRelative(0.1f, -0.14f, 0.26f, -0.22f, 0.43f, -0.22f);
        b.curveToRelative(0.36f, 0.0f, 0.62f, 0.35f, 0.52f, 0.7f);
        b.lineTo(19.4f, 16.0f);
        b.lineToRelative(0.39f, 1.3f);
        b.curveToRelative(0.1f, 0.35f, -0.16f, 0.7f, -0.52f, 0.7f);
        b.curveToRelative(-0.17f, 0.0f, -0.33f, -0.08f, -0.43f, -0.22f);
        b.lineTo(18.25f, 17.0f);
        b.horizontalLineTo(15.4f);
        b.lineToRelative(1.08f, 3.66f);
        b.curveToRelative(0.11f, 0.37f, -0.17f, 0.74f, -0.55f, 0.74f);
        b.curveToRelative(-0.2f, 0.0f, -0.39f, -0.11f, -0.5f, -0.28f);
        b.lineTo(13.0f, 17.0f);
        b.horizontalLineToRelative(-2.97f);
        b.curveToRelative(-0.53f, 0.0f, -1.0f, -0.4f, -1.03f, -0.93f);
        b.curveTo(8.96f, 15.48f, 9.43f, 15.0f, 10.0f, 15.0f);
        b.horizontalLineToRelative(3.0f);
        b.lineToRelative(2.43f, -4.12f);
        b.curveTo(15.54f, 10.71f, 15.73f, 10.6f, 15.93f, 10.6f);
        b.close();
        b.moveTo(8.07f, 2.6f);
        b.curveToRelative(-0.39f, 0.0f, -0.66f, 0.37f, -0.55f, 0.74f);
        b.lineTo(8.6f, 7.0f);
        b.horizontalLineTo(5.75f);
        b.lineTo(5.16f, 6.22f);
        b.curveTo(5.06f, 6.08f, 4.9f, 6.0f, 4.73f, 6.0f);
        b.curveTo(4.37f, 6.0f, 4.11f, 6.35f, 4.21f, 6.7f);
        b.lineTo(4.6f, 8.0f);
        b.lineTo(4.21f, 9.3f);
        b.curveTo(4.11f, 9.65f, 4.37f, 10.0f, 4.73f, 10.0f);
        b.curveToRelative(0.17f, 0.0f, 0.33f, -0.08f, 0.43f, -0.22f);
        b.lineTo(5.75f, 9.0f);
        b.horizontalLineTo(8.6f);
        b.lineToRelative(-1.08f, 3.66f);
        b.curveToRelative(-0.11f, 0.37f, 0.17f, 0.74f, 0.55f, 0.74f);
        b.curveToRelative(0.2f, 0.0f, 0.39f, -0.11f, 0.5f, -0.28f);
        b.lineTo(11.0f, 9.0f);
        b.horizontalLineToRelative(2.97f);
        b.curveToRelative(0.53f, 0.0f, 1.0f, -0.4f, 1.03f, -0.93f);
        b.curveTo(15.04f, 7.48f, 14.57f, 7.0f, 14.0f, 7.0f);
        b.horizontalLineToRelative(-3.0f);
        b.lineTo(8.57f, 2.88f);
        b.curveTo(8.46f, 2.71f, 8.27f, 2.6f, 8.07f, 2.6f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectingAirports = build;
        build.getClass();
        return build;
    }
}
