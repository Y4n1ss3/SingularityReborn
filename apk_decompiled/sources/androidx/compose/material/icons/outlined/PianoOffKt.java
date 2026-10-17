package androidx.compose.material.icons.outlined;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PianoOffKt {
    private static ImageVector _pianoOff;

    public static final ImageVector getPianoOff(Icons.Outlined outlined) {
        ImageVector imageVector = _pianoOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PianoOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineTo(3.0f, 5.83f);
        i.verticalLineTo(19.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(13.17f);
        gy.B(i, 1.61f, 1.61f, 21.19f, 21.19f);
        uo.p(i, 8.25f, 19.0f, 5.0f, 7.83f);
        i.lineToRelative(2.0f, 2.0f);
        i.verticalLineToRelative(3.67f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        uo.r(i, 0.25f, 19.0f, 9.75f, 19.0f);
        i.verticalLineToRelative(-4.5f);
        i.horizontalLineTo(10.0f);
        i.curveToRelative(0.46f, 0.0f, 0.82f, -0.31f, 0.94f, -0.73f);
        kp0.k(i, 3.31f, 3.31f, 19.0f, 9.75f);
        i.moveTo(11.0f, 8.17f);
        i.lineTo(5.83f, 3.0f);
        i.horizontalLineTo(19.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        k4.z(i, 13.17f, -2.0f, -2.0f, 5.0f);
        i.horizontalLineToRelative(-2.0f);
        i.verticalLineToRelative(8.5f);
        i.curveToRelative(0.0f, 0.19f, -0.07f, 0.36f, -0.16f, 0.51f);
        fc.t(i, 13.0f, 10.17f, 5.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 8.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pianoOff = build;
        build.getClass();
        return build;
    }
}
