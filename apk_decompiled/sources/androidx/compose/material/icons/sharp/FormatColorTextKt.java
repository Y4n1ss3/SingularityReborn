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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatColorTextKt {
    private static ImageVector _formatColorText;

    public static final ImageVector getFormatColorText(Icons.Sharp sharp) {
        ImageVector imageVector = _formatColorText;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatColorText", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(2.0f, 20.0f, 20.0f, 4.0f, 2.0f);
        k4.D(d, 20.0f, 5.49f, 17.0f, 2.42f);
        d.lineToRelative(1.27f, -3.58f);
        uo.n(d, 5.65f, 16.09f, 17.0f, 2.42f);
        d.lineTo(13.25f, 3.0f);
        gy.n(d, -2.5f, 5.49f, 17.0f);
        d.moveTo(9.91f, 11.39f);
        d.lineToRelative(2.03f, -5.79f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(d, 0.12f, 2.03f, 5.79f, 9.91f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorText = build;
        build.getClass();
        return build;
    }
}
