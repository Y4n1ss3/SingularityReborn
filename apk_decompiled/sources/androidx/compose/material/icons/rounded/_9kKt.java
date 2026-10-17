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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _9kKt {
    private static ImageVector __9k;

    public static final ImageVector get_9k(Icons.Rounded rounded) {
        ImageVector imageVector = __9k;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._9k", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(8.0f, 10.0f, 1.5f, 1.5f, 8.0f);
        k4.B(d, 10.0f, 19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        d.close();
        d.moveTo(11.0f, 14.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineTo(7.25f);
        d.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        af0.u(d, 9.5f, -1.0f, -2.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineTo(10.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineTo(10.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(d, 14.0f, 16.59f, 15.0f);
        d.lineTo(16.59f, 15.0f);
        d.curveToRelative(-0.22f, 0.0f, -0.42f, -0.1f, -0.55f, -0.27f);
        d.lineToRelative(-1.54f, -1.98f);
        d.verticalLineToRelative(1.55f);
        d.curveToRelative(0.0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f);
        d.horizontalLineTo(13.7f);
        d.curveToRelative(-0.39f, 0.0f, -0.7f, -0.31f, -0.7f, -0.7f);
        d.verticalLineTo(9.7f);
        d.curveTo(13.0f, 9.31f, 13.31f, 9.0f, 13.7f, 9.0f);
        d.horizontalLineToRelative(0.09f);
        d.curveToRelative(0.39f, 0.0f, 0.7f, 0.31f, 0.7f, 0.7f);
        d.verticalLineToRelative(1.55f);
        d.lineToRelative(1.54f, -1.98f);
        d.curveTo(16.17f, 9.1f, 16.38f, 9.0f, 16.59f, 9.0f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(0.58f, 0.0f, 0.91f, 0.66f, 0.56f, 1.12f);
        d.lineTo(15.75f, 12.0f);
        d.lineToRelative(1.41f, 1.88f);
        d.curveTo(17.5f, 14.34f, 17.17f, 15.0f, 16.59f, 15.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __9k = build;
        build.getClass();
        return build;
    }
}
