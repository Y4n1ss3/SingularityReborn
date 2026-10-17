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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _1xMobiledataKt {
    private static ImageVector __1xMobiledata;

    public static final ImageVector get_1xMobiledata(Icons.Rounded rounded) {
        ImageVector imageVector = __1xMobiledata;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._1xMobiledata", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(5.0f, 7.0f, 2.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.verticalLineToRelative(8.0f);
        a.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.verticalLineTo(9.0f);
        a.horizontalLineTo(5.0f);
        a.curveTo(4.45f, 9.0f, 4.0f, 8.55f, 4.0f, 8.0f);
        a.verticalLineToRelative(0.0f);
        a.curveTo(4.0f, 7.45f, 4.45f, 7.0f, 5.0f, 7.0f);
        k4.x(a, 15.83f, 11.72f, 1.92f, -3.21f);
        a.curveTo(18.15f, 7.85f, 17.67f, 7.0f, 16.9f, 7.0f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(-0.35f, 0.0f, -0.68f, 0.18f, -0.86f, 0.49f);
        a.lineToRelative(-1.37f, 2.28f);
        a.lineToRelative(-1.38f, -2.29f);
        a.curveTo(13.11f, 7.18f, 12.79f, 7.0f, 12.44f, 7.0f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(-0.78f, 0.0f, -1.26f, 0.85f, -0.86f, 1.51f);
        a.lineToRelative(1.92f, 3.21f);
        a.lineToRelative(-2.26f, 3.77f);
        a.curveToRelative(-0.4f, 0.67f, 0.08f, 1.51f, 0.86f, 1.51f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(0.35f, 0.0f, 0.68f, -0.18f, 0.86f, -0.49f);
        a.lineToRelative(1.71f, -2.85f);
        a.lineToRelative(1.71f, 2.85f);
        a.curveToRelative(0.18f, 0.3f, 0.51f, 0.49f, 0.86f, 0.49f);
        a.horizontalLineToRelative(0.01f);
        a.curveToRelative(0.78f, 0.0f, 1.26f, -0.85f, 0.86f, -1.51f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 15.83f, 11.72f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __1xMobiledata = build;
        build.getClass();
        return build;
    }
}
