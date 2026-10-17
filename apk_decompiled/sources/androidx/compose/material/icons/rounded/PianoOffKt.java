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
import defpackage.c21;
import defpackage.fc;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PianoOffKt {
    private static ImageVector _pianoOff;

    public static final ImageVector getPianoOff(Icons.Rounded rounded) {
        ImageVector imageVector = _pianoOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PianoOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.49f, 21.9f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(3.51f, 3.51f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(3.0f, 5.83f);
        b.verticalLineTo(19.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(13.17f);
        b.lineToRelative(0.9f, 0.9f);
        b.curveTo(19.46f, 22.29f, 20.09f, 22.29f, 20.49f, 21.9f);
        c21.d(b, 8.25f, 19.0f, 5.0f, 7.83f);
        b.lineToRelative(2.0f, 2.0f);
        b.verticalLineToRelative(3.67f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        uo.r(b, 0.25f, 19.0f, 9.75f, 19.0f);
        b.verticalLineToRelative(-4.5f);
        b.horizontalLineTo(10.0f);
        b.curveToRelative(0.46f, 0.0f, 0.82f, -0.31f, 0.94f, -0.73f);
        kp0.k(b, 3.31f, 3.31f, 19.0f, 9.75f);
        b.moveTo(11.0f, 8.17f);
        b.lineTo(5.83f, 3.0f);
        b.horizontalLineTo(19.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        k4.z(b, 13.17f, -2.0f, -2.0f, 5.0f);
        b.horizontalLineToRelative(-2.0f);
        b.verticalLineToRelative(8.5f);
        b.curveToRelative(0.0f, 0.19f, -0.07f, 0.36f, -0.16f, 0.51f);
        fc.t(b, 13.0f, 10.17f, 5.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 8.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pianoOff = build;
        build.getClass();
        return build;
    }
}
