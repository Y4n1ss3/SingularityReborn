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
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DownloadForOfflineKt {
    private static ImageVector _downloadForOffline;

    public static final ImageVector getDownloadForOffline(Icons.Rounded rounded) {
        ImageVector imageVector = _downloadForOffline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DownloadForOffline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.49f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.51f, 2.0f, 12.0f, 2.0f);
        bv.g(b, 11.0f, 10.0f, 7.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.horizontalLineToRelative(1.79f);
        b.curveToRelative(0.45f, 0.0f, 0.67f, 0.54f, 0.35f, 0.85f);
        b.lineToRelative(-2.79f, 2.79f);
        b.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        b.lineToRelative(-2.79f, -2.79f);
        b.curveTo(8.54f, 10.54f, 8.76f, 10.0f, 9.21f, 10.0f);
        kp0.B(b, 11.0f, 16.0f, 17.0f, 8.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(8.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveTo(17.0f, 16.55f, 16.55f, 17.0f, 16.0f, 17.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downloadForOffline = build;
        build.getClass();
        return build;
    }
}
