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
import defpackage.bv;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _60fpsKt {
    private static ImageVector __60fps;

    public static final ImageVector get_60fps(Icons.Rounded rounded) {
        ImageVector imageVector = __60fps;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._60fps", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(19.0f, 8.0f, 8.0f, -4.0f, 8.0f);
        w.horizontalLineTo(19.0f);
        w.moveTo(19.0f, 5.0f);
        w.horizontalLineToRelative(-4.0f);
        w.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        w.verticalLineToRelative(8.0f);
        w.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        w.horizontalLineToRelative(4.0f);
        w.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        w.verticalLineTo(8.0f);
        w.curveTo(22.0f, 6.34f, 20.66f, 5.0f, 19.0f, 5.0f);
        k4.r(w, 10.0f, 6.5f, 10.0f, 6.5f);
        w.curveTo(10.0f, 5.67f, 9.33f, 5.0f, 8.5f, 5.0f);
        w.horizontalLineTo(5.0f);
        w.curveTo(3.34f, 5.0f, 2.0f, 6.34f, 2.0f, 8.0f);
        w.verticalLineToRelative(8.0f);
        w.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        w.horizontalLineToRelative(3.0f);
        w.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        w.verticalLineToRelative(-3.0f);
        w.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        uf.t(w, 5.0f, 8.0f, 3.5f);
        w.curveTo(9.33f, 8.0f, 10.0f, 7.33f, 10.0f, 6.5f);
        af0.A(w, 8.0f, 13.0f, 3.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(w, -3.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __60fps = build;
        build.getClass();
        return build;
    }
}
