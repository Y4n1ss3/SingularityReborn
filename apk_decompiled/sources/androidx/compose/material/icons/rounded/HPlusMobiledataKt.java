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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HPlusMobiledataKt {
    private static ImageVector _hPlusMobiledata;

    public static final ImageVector getHPlusMobiledata(Icons.Rounded rounded) {
        ImageVector imageVector = _hPlusMobiledata;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HPlusMobiledata", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(12.0f, 11.0f, 6.0f, 8.0f);
        c.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c.horizontalLineToRelative(0.0f);
        c.curveTo(4.45f, 7.0f, 4.0f, 7.45f, 4.0f, 8.0f);
        c.verticalLineToRelative(8.0f);
        c.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        c.horizontalLineToRelative(0.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(c, -3.0f, 6.0f, 3.0f);
        c.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        c.horizontalLineToRelative(0.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c.verticalLineTo(8.0f);
        c.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c.horizontalLineToRelative(0.0f);
        c.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        k4.D(c, 11.0f, 21.0f, 11.0f, -1.0f);
        c.verticalLineToRelative(-1.0f);
        c.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c.horizontalLineToRelative(0.0f);
        c.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        c.verticalLineToRelative(1.0f);
        c.horizontalLineToRelative(-1.0f);
        c.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        c.verticalLineToRelative(0.0f);
        c.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        c.horizontalLineToRelative(1.0f);
        c.verticalLineToRelative(1.0f);
        c.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        c.horizontalLineToRelative(0.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c.verticalLineToRelative(-1.0f);
        c.horizontalLineToRelative(1.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c.verticalLineToRelative(0.0f);
        c.curveTo(22.0f, 11.45f, 21.55f, 11.0f, 21.0f, 11.0f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hPlusMobiledata = build;
        build.getClass();
        return build;
    }
}
