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
import defpackage.af0;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SimCardDownloadKt {
    private static ImageVector _simCardDownload;

    public static final ImageVector getSimCardDownload(Icons.Rounded rounded) {
        ImageVector imageVector = _simCardDownload;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SimCardDownload", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(18.0f, 2.0f, -7.17f);
        a.curveTo(10.3f, 2.0f, 9.79f, 2.21f, 9.41f, 2.59f);
        a.lineTo(4.59f, 7.41f);
        a.curveTo(4.21f, 7.79f, 4.0f, 8.3f, 4.0f, 8.83f);
        a.verticalLineTo(20.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(12.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.verticalLineTo(4.0f);
        a.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        k4.x(a, 11.65f, 16.65f, -2.79f, -2.79f);
        a.curveTo(8.54f, 13.54f, 8.76f, 13.0f, 9.21f, 13.0f);
        a.horizontalLineTo(11.0f);
        a.verticalLineToRelative(-2.99f);
        a.curveToRelative(0.0f, -0.55f, 0.44f, -0.99f, 0.99f, -1.0f);
        a.horizontalLineToRelative(0.0f);
        a.curveTo(12.55f, 9.0f, 13.0f, 9.45f, 13.0f, 10.01f);
        a.verticalLineTo(13.0f);
        a.horizontalLineToRelative(1.79f);
        a.curveToRelative(0.45f, 0.0f, 0.67f, 0.54f, 0.35f, 0.85f);
        a.lineToRelative(-2.79f, 2.79f);
        a.curveTo(12.16f, 16.84f, 11.84f, 16.84f, 11.65f, 16.65f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _simCardDownload = build;
        build.getClass();
        return build;
    }
}
