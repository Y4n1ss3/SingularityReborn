package androidx.compose.material.icons.filled;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UpdateKt {
    private static ImageVector _update;

    public static final ImageVector getUpdate(Icons.Filled filled) {
        ImageVector imageVector = _update;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Update", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(21.0f, 10.12f, -6.78f, 2.74f, -2.82f);
        i.curveToRelative(-2.73f, -2.7f, -7.15f, -2.8f, -9.88f, -0.1f);
        i.curveToRelative(-2.73f, 2.71f, -2.73f, 7.08f, 0.0f, 9.79f);
        i.reflectiveCurveToRelative(7.15f, 2.71f, 9.88f, 0.0f);
        i.curveTo(18.32f, 15.65f, 19.0f, 14.08f, 19.0f, 12.1f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.0f, 1.98f, -0.88f, 4.55f, -2.64f, 6.29f);
        i.curveToRelative(-3.51f, 3.48f, -9.21f, 3.48f, -12.72f, 0.0f);
        i.curveToRelative(-3.5f, -3.47f, -3.53f, -9.11f, -0.02f, -12.58f);
        i.reflectiveCurveToRelative(9.14f, -3.47f, 12.65f, 0.0f);
        uf.o(i, 21.0f, 3.0f, 10.12f);
        i.moveTo(12.5f, 8.0f);
        i.verticalLineToRelative(4.25f);
        i.lineToRelative(3.5f, 2.08f);
        i.lineToRelative(-0.72f, 1.21f);
        i.lineTo(11.0f, 13.0f);
        i.verticalLineTo(8.0f);
        i.horizontalLineTo(12.5f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _update = build;
        build.getClass();
        return build;
    }
}
