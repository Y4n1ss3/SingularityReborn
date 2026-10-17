package androidx.compose.material.icons.sharp;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SickKt {
    private static ImageVector _sick;

    public static final ImageVector getSick(Icons.Sharp sharp) {
        ImageVector imageVector = _sick;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Sick", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 9.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, 2.0f, -4.0f, 2.0f, -4.0f);
        b.reflectiveCurveToRelative(2.0f, 2.9f, 2.0f, 4.0f);
        b.curveTo(23.0f, 8.1f, 22.1f, 9.0f, 21.0f, 9.0f);
        b.close();
        b.moveTo(17.5f, 7.0f);
        b.curveToRelative(0.0f, -0.73f, 0.41f, -1.71f, 0.92f, -2.66f);
        b.curveTo(16.68f, 2.88f, 14.44f, 2.0f, 11.99f, 2.0f);
        b.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        b.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -0.55f, -0.06f, -1.09f, -0.14f, -1.62f);
        b.curveTo(21.58f, 10.45f, 21.3f, 10.5f, 21.0f, 10.5f);
        b.curveTo(19.07f, 10.5f, 17.5f, 8.93f, 17.5f, 7.0f);
        k4.x(b, 15.62f, 7.38f, 1.06f, 1.06f);
        b.lineTo(15.62f, 9.5f);
        b.lineToRelative(1.06f, 1.06f);
        b.lineToRelative(-1.06f, 1.06f);
        r6.C(b, 13.5f, 9.5f, 15.62f, 7.38f);
        b.moveTo(7.32f, 8.44f);
        b.lineToRelative(1.06f, -1.06f);
        b.lineTo(10.5f, 9.5f);
        b.lineToRelative(-2.12f, 2.12f);
        b.lineToRelative(-1.06f, -1.06f);
        r6.C(b, 8.38f, 9.5f, 7.32f, 8.44f);
        b.moveTo(15.44f, 17.0f);
        b.curveToRelative(-0.69f, -1.19f, -1.97f, -2.0f, -3.44f, -2.0f);
        b.reflectiveCurveToRelative(-2.75f, 0.81f, -3.44f, 2.0f);
        b.horizontalLineTo(6.88f);
        b.curveToRelative(0.3f, -0.76f, 0.76f, -1.43f, 1.34f, -1.99f);
        b.lineTo(5.24f, 13.3f);
        b.curveToRelative(-0.45f, 0.26f, -1.01f, 0.28f, -1.49f, 0.0f);
        b.curveToRelative(-0.72f, -0.41f, -0.96f, -1.33f, -0.55f, -2.05f);
        b.curveToRelative(0.41f, -0.72f, 1.33f, -0.96f, 2.05f, -0.55f);
        b.curveToRelative(0.48f, 0.28f, 0.74f, 0.78f, 0.74f, 1.29f);
        b.lineToRelative(3.58f, 2.07f);
        b.curveToRelative(0.73f, -0.36f, 1.55f, -0.56f, 2.43f, -0.56f);
        b.curveToRelative(2.33f, 0.0f, 4.32f, 1.45f, 5.12f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 15.44f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sick = build;
        build.getClass();
        return build;
    }
}
