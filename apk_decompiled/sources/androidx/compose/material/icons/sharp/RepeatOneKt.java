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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RepeatOneKt {
    private static ImageVector _repeatOne;

    public static final ImageVector getRepeatOne(Icons.Sharp sharp) {
        ImageVector imageVector = _repeatOne;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RepeatOne", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(7.0f, 7.0f, 10.0f, 3.0f);
        b.lineToRelative(4.0f, -4.0f);
        b.lineToRelative(-4.0f, -4.0f);
        bv.q(b, 3.0f, 5.0f, 5.0f, 6.0f);
        gy.n(b, 2.0f, 7.0f, 7.0f);
        b.moveTo(17.0f, 17.0f);
        b.lineTo(7.0f, 17.0f);
        b.verticalLineToRelative(-3.0f);
        b.lineToRelative(-4.0f, 4.0f);
        r6.A(b, 4.0f, 4.0f, -3.0f, 12.0f);
        r6.p(b, -6.0f, -2.0f, 4.0f);
        b.moveTo(13.0f, 15.0f);
        b.lineTo(13.0f, 9.0f);
        fc.D(b, -1.0f, -2.0f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.h(b, 1.5f, 4.0f, 13.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _repeatOne = build;
        build.getClass();
        return build;
    }
}
