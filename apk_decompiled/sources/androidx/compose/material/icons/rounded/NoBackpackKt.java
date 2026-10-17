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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoBackpackKt {
    private static ImageVector _noBackpack;

    public static final ImageVector getNoBackpack(Icons.Rounded rounded) {
        ImageVector imageVector = _noBackpack;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoBackpack", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.98f, 4.15f);
        b.curveToRelative(0.01f, 0.0f, 0.01f, -0.01f, 0.02f, -0.01f);
        b.verticalLineTo(3.5f);
        b.curveTo(7.0f, 2.67f, 7.67f, 2.0f, 8.5f, 2.0f);
        b.reflectiveCurveTo(10.0f, 2.67f, 10.0f, 3.5f);
        uf.z(b, 4.0f, 4.0f, 3.5f);
        b.curveTo(14.0f, 2.67f, 14.67f, 2.0f, 15.5f, 2.0f);
        b.reflectiveCurveTo(17.0f, 2.67f, 17.0f, 3.5f);
        b.verticalLineToRelative(0.64f);
        b.curveToRelative(1.72f, 0.45f, 3.0f, 2.0f, 3.0f, 3.86f);
        b.verticalLineToRelative(9.17f);
        b.lineToRelative(-2.03f, -2.03f);
        b.curveTo(17.98f, 15.09f, 18.0f, 15.05f, 18.0f, 15.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        gy.n(b, -2.17f, 6.98f, 4.15f);
        b.moveTo(20.49f, 21.9f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.lineToRelative(-0.14f, -0.14f);
        b.curveTo(18.65f, 21.91f, 18.34f, 22.0f, 18.0f, 22.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, -0.36f, 0.06f, -0.69f, 0.15f, -1.02f);
        b.lineTo(2.1f, 4.93f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(16.97f, 16.97f);
        b.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        k4.x(b, 11.17f, 14.0f, -2.0f, -2.0f);
        b.horizontalLineTo(7.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 11.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noBackpack = build;
        build.getClass();
        return build;
    }
}
