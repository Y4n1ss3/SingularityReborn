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
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotTouchKt {
    private static ImageVector _doNotTouch;

    public static final ImageVector getDoNotTouch(Icons.Sharp sharp) {
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DoNotTouch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(13.0f, 10.17f, -2.5f, -2.5f, 1.0f);
        bv.s(j, 13.0f, 10.17f, 20.0f, 4.0f);
        af0.w(j, -2.5f, 7.0f, -1.0f, 2.0f);
        k4.q(j, 14.0f, 9.17f, 6.0f, 6.0f);
        k4.B(j, 4.0f, 9.5f, 3.0f, 7.01f);
        j.verticalLineToRelative(1.18f);
        j.lineTo(9.5f, 6.67f);
        j.verticalLineTo(3.0f);
        j.close();
        j.moveTo(21.19f, 21.19f);
        j.lineTo(2.81f, 2.81f);
        j.lineTo(1.39f, 4.22f);
        j.lineTo(7.0f, 9.83f);
        j.verticalLineToRelative(4.3f);
        j.lineToRelative(-3.32f, -1.9f);
        j.lineTo(2.0f, 13.88f);
        j.lineTo(9.68f, 22.0f);
        j.horizontalLineToRelative(9.54f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(j, 0.56f, 0.61f, 21.19f, 21.19f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = build;
        build.getClass();
        return build;
    }
}
