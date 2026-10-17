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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoCameraBackKt {
    private static ImageVector _photoCameraBack;

    public static final ImageVector getPhotoCameraBack(Icons.Rounded rounded) {
        ImageVector imageVector = _photoCameraBack;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhotoCameraBack", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 5.0f, -3.17f, -1.24f, -1.35f);
        i.curveTo(15.22f, 3.24f, 14.68f, 3.0f, 14.12f, 3.0f);
        i.horizontalLineTo(9.88f);
        i.curveTo(9.32f, 3.0f, 8.78f, 3.24f, 8.41f, 3.65f);
        i.lineTo(7.17f, 5.0f);
        i.horizontalLineTo(4.0f);
        i.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(7.0f);
        i.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        r6.g(i, 17.0f, 17.0f, 7.0f);
        i.curveToRelative(-0.41f, 0.0f, -0.65f, -0.47f, -0.4f, -0.8f);
        i.lineToRelative(2.0f, -2.67f);
        i.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        i.lineTo(11.25f, 16.0f);
        i.lineToRelative(2.6f, -3.47f);
        i.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        i.lineToRelative(2.75f, 3.67f);
        i.curveTo(17.65f, 16.53f, 17.41f, 17.0f, 17.0f, 17.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoCameraBack = build;
        build.getClass();
        return build;
    }
}
