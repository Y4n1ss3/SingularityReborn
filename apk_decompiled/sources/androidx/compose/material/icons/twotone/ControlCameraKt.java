package androidx.compose.material.icons.twotone;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ControlCameraKt {
    private static ImageVector _controlCamera;

    public static final ImageVector getControlCamera(Icons.TwoTone twoTone) {
        ImageVector imageVector = _controlCamera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ControlCamera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.3f, 13.77f, 5.54f, 12.0f);
        i.lineToRelative(1.76f, -1.77f);
        i.lineToRelative(-1.76f, -1.77f);
        bv.o(i, 2.0f, 12.0f, 3.54f, 3.54f);
        i.moveTo(15.54f, 18.46f);
        i.lineToRelative(-1.77f, -1.76f);
        i.lineTo(12.0f, 18.46f);
        i.lineToRelative(-1.77f, -1.76f);
        gy.B(i, -1.77f, 1.76f, 12.0f, 22.0f);
        i.moveTo(18.46f, 15.54f);
        i.lineTo(22.0f, 12.0f);
        i.lineToRelative(-3.54f, -3.54f);
        i.lineToRelative(-1.76f, 1.77f);
        bv.o(i, 18.46f, 12.0f, -1.76f, 1.77f);
        i.moveTo(12.0f, 5.54f);
        i.lineToRelative(1.77f, 1.76f);
        i.lineToRelative(1.77f, -1.76f);
        i.lineTo(12.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 8.46f, 5.54f, 1.77f, 1.76f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 12.0f, -3.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _controlCamera = build;
        build.getClass();
        return build;
    }
}
