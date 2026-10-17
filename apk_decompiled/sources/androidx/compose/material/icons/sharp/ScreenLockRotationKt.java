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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenLockRotationKt {
    private static ImageVector _screenLockRotation;

    public static final ImageVector getScreenLockRotation(Icons.Sharp sharp) {
        ImageVector imageVector = _screenLockRotation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ScreenLockRotation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.52f, 21.48f);
        b.curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
        b.lineTo(0.05f, 13.0f);
        b.curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
        b.lineToRelative(0.66f, -0.03f);
        fc.C(b, -3.81f, -3.82f, -1.33f, 1.33f);
        b.moveTo(20.05f, 4.0f);
        b.verticalLineToRelative(-0.36f);
        b.curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f);
        b.curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f);
        fc.w(b, 15.05f, 4.0f, -1.0f, 6.0f);
        uf.C(b, 7.0f, 21.05f, 4.0f, -1.0f);
        k4.C(b, 19.25f, 4.0f, -3.4f, -0.5f);
        b.curveToRelative(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f);
        b.reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f);
        uo.l(b, 19.25f, 4.0f, 19.73f, 11.2f);
        b.lineToRelative(-1.41f, 1.41f);
        b.lineToRelative(2.22f, 2.22f);
        b.lineToRelative(-5.66f, 5.66f);
        b.lineTo(3.56f, 9.17f);
        b.lineToRelative(5.66f, -5.66f);
        b.lineToRelative(2.1f, 2.1f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineTo(9.22f, 0.69f);
        b.lineTo(0.74f, 9.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 14.14f, 14.14f, 8.48f, -8.48f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenLockRotation = build;
        build.getClass();
        return build;
    }
}
