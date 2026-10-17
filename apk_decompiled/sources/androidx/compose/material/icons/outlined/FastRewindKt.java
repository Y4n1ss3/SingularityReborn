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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FastRewindKt {
    private static ImageVector _fastRewind;

    public static final ImageVector getFastRewind(Icons.Outlined outlined) {
        ImageVector imageVector = _fastRewind;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FastRewind", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(18.0f, 9.86f, 4.28f, 14.97f, 12.0f);
        y.lineTo(18.0f, 9.86f);
        y.moveToRelative(-9.0f, 0.0f);
        y.verticalLineToRelative(4.28f);
        y.lineTo(5.97f, 12.0f);
        y.lineTo(9.0f, 9.86f);
        y.moveTo(20.0f, 6.0f);
        y.lineToRelative(-8.5f, 6.0f);
        gy.B(y, 8.5f, 6.0f, 20.0f, 6.0f);
        y.moveTo(11.0f, 6.0f);
        y.lineToRelative(-8.5f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(y, 8.5f, 6.0f, 11.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastRewind = build;
        build.getClass();
        return build;
    }
}
