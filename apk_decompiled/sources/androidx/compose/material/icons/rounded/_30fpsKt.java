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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _30fpsKt {
    private static ImageVector __30fps;

    public static final ImageVector get_30fps(Icons.Rounded rounded) {
        ImageVector imageVector = __30fps;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._30fps", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.0f, 6.5f, 2.0f, 6.5f);
        i.curveTo(2.0f, 7.33f, 2.67f, 8.0f, 3.5f, 8.0f);
        r6.y(i, 8.0f, 2.5f, 4.5f);
        i.curveTo(3.67f, 10.5f, 3.0f, 11.17f, 3.0f, 12.0f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        fc.q(i, 8.0f, 16.0f, 3.5f);
        i.curveTo(2.67f, 16.0f, 2.0f, 16.67f, 2.0f, 17.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(2.0f, 18.33f, 2.67f, 19.0f, 3.5f, 19.0f);
        i.horizontalLineTo(8.0f);
        i.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        i.verticalLineToRelative(-1.9f);
        i.curveToRelative(0.0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f);
        i.curveToRelative(1.16f, 0.0f, 2.1f, -0.94f, 2.1f, -2.1f);
        i.verticalLineTo(8.0f);
        i.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        i.horizontalLineTo(3.5f);
        i.curveTo(2.67f, 5.0f, 2.0f, 5.67f, 2.0f, 6.5f);
        uo.C(i, 19.0f, 8.0f, 8.0f, -4.0f);
        i.verticalLineTo(8.0f);
        i.horizontalLineTo(19.0f);
        i.moveTo(19.0f, 5.0f);
        i.horizontalLineToRelative(-4.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        i.verticalLineToRelative(8.0f);
        i.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        i.horizontalLineToRelative(4.0f);
        i.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        i.verticalLineTo(8.0f);
        i.curveTo(22.0f, 6.34f, 20.66f, 5.0f, 19.0f, 5.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __30fps = build;
        build.getClass();
        return build;
    }
}
