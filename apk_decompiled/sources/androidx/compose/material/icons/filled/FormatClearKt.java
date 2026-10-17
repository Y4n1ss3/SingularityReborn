package androidx.compose.material.icons.filled;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatClearKt {
    private static ImageVector _formatClear;

    public static final ImageVector getFormatClear(Icons.Filled filled) {
        ImageVector imageVector = _formatClear;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FormatClear", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(3.27f, 5.0f, 2.0f, 6.27f);
        i.lineToRelative(6.97f, 6.97f);
        i.lineTo(6.5f, 19.0f);
        i.horizontalLineToRelative(3.0f);
        i.lineToRelative(1.57f, -3.66f);
        i.lineTo(16.73f, 21.0f);
        i.lineTo(18.0f, 19.73f);
        r6.C(i, 3.55f, 5.27f, 3.27f, 5.0f);
        i.moveTo(6.0f, 5.0f);
        uo.k(i, 0.18f, 8.82f, 8.0f, 2.4f);
        i.lineToRelative(-0.72f, 1.68f);
        i.lineToRelative(2.1f, 2.1f);
        fc.v(i, 14.21f, 8.0f, 20.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatClear = build;
        build.getClass();
        return build;
    }
}
