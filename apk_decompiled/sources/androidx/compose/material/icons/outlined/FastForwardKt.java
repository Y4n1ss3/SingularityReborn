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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FastForwardKt {
    private static ImageVector _fastForward;

    public static final ImageVector getFastForward(Icons.Outlined outlined) {
        ImageVector imageVector = _fastForward;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FastForward", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.0f, 9.86f, 18.03f, 12.0f);
        i.lineTo(15.0f, 14.14f);
        i.verticalLineTo(9.86f);
        i.moveTo(6.0f, 9.86f);
        i.lineTo(9.03f, 12.0f);
        i.lineTo(6.0f, 14.14f);
        i.verticalLineTo(9.86f);
        i.moveTo(13.0f, 6.0f);
        i.verticalLineToRelative(12.0f);
        i.lineToRelative(8.5f, -6.0f);
        r6.C(i, 13.0f, 6.0f, 13.0f, 6.0f);
        i.moveTo(4.0f, 6.0f);
        i.verticalLineToRelative(12.0f);
        i.lineToRelative(8.5f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 4.0f, 6.0f, 4.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastForward = build;
        build.getClass();
        return build;
    }
}
