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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CameraOutdoorKt {
    private static ImageVector _cameraOutdoor;

    public static final ImageVector getCameraOutdoor(Icons.Rounded rounded) {
        ImageVector imageVector = _cameraOutdoor;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CameraOutdoor", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 13.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.0f);
        b.lineToRelative(1.27f, 0.67f);
        b.curveTo(19.6f, 16.85f, 20.0f, 16.61f, 20.0f, 16.23f);
        b.verticalLineToRelative(-2.46f);
        b.curveToRelative(0.0f, -0.38f, -0.4f, -0.62f, -0.73f, -0.44f);
        uf.o(b, 18.0f, 14.0f, 13.0f);
        b.moveTo(10.8f, 3.9f);
        b.lineToRelative(-6.0f, 4.5f);
        b.curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f);
        b.verticalLineToRelative(9.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(13.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        k4.q(b, 6.0f, -9.0f, 6.0f, -4.5f);
        b.lineToRelative(6.0f, 4.5f);
        r6.q(b, 0.0f, 1.0f, 2.0f, -1.0f);
        b.curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f);
        b.lineToRelative(-6.0f, -4.5f);
        b.curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraOutdoor = build;
        build.getClass();
        return build;
    }
}
