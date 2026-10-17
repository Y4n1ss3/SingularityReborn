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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.Sharp sharp) {
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NearMeDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 6.34f, 21.0f, 3.0f);
        gy.B(i, -3.34f, 9.0f, 12.0f, 6.34f);
        i.moveTo(22.61f, 19.78f);
        i.lineTo(4.22f, 1.39f);
        i.lineTo(2.81f, 2.81f);
        i.lineToRelative(5.07f, 5.07f);
        i.lineTo(3.0f, 9.69f);
        i.verticalLineToRelative(1.41f);
        i.lineToRelative(7.07f, 2.83f);
        i.lineTo(12.9f, 21.0f);
        i.horizontalLineToRelative(1.41f);
        i.lineToRelative(1.81f, -4.88f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 5.07f, 5.07f, 22.61f, 19.78f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMeDisabled = build;
        build.getClass();
        return build;
    }
}
