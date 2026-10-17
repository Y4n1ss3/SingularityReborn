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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupsKt {
    private static ImageVector _groups;

    public static final ImageVector getGroups(Icons.Filled filled) {
        ImageVector imageVector = _groups;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Groups", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 12.75f);
        b.curveToRelative(1.63f, 0.0f, 3.07f, 0.39f, 4.24f, 0.9f);
        b.curveToRelative(1.08f, 0.48f, 1.76f, 1.56f, 1.76f, 2.73f);
        b.lineTo(18.0f, 18.0f);
        b.horizontalLineTo(6.0f);
        b.lineToRelative(0.0f, -1.61f);
        b.curveToRelative(0.0f, -1.18f, 0.68f, -2.26f, 1.76f, -2.73f);
        b.curveTo(8.93f, 13.14f, 10.37f, 12.75f, 12.0f, 12.75f);
        b.close();
        b.moveTo(4.0f, 13.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.curveTo(2.0f, 12.1f, 2.9f, 13.0f, 4.0f, 13.0f);
        b.close();
        b.moveTo(5.13f, 14.1f);
        b.curveTo(4.76f, 14.04f, 4.39f, 14.0f, 4.0f, 14.0f);
        b.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        b.curveTo(0.48f, 14.9f, 0.0f, 15.62f, 0.0f, 16.43f);
        k4.y(b, 18.0f, 4.5f, 0.0f, -1.61f);
        b.curveTo(4.5f, 15.56f, 4.73f, 14.78f, 5.13f, 14.1f);
        b.close();
        b.moveTo(20.0f, 13.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.curveTo(18.0f, 12.1f, 18.9f, 13.0f, 20.0f, 13.0f);
        b.close();
        b.moveTo(24.0f, 16.43f);
        b.curveToRelative(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        b.curveTo(21.93f, 14.21f, 20.99f, 14.0f, 20.0f, 14.0f);
        b.curveToRelative(-0.39f, 0.0f, -0.76f, 0.04f, -1.13f, 0.1f);
        b.curveToRelative(0.4f, 0.68f, 0.63f, 1.46f, 0.63f, 2.29f);
        b.verticalLineTo(18.0f);
        b.lineToRelative(4.5f, 0.0f);
        b.verticalLineTo(16.43f);
        b.close();
        b.moveTo(12.0f, 6.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        b.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        b.curveTo(9.0f, 7.34f, 10.34f, 6.0f, 12.0f, 6.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groups = build;
        build.getClass();
        return build;
    }
}
