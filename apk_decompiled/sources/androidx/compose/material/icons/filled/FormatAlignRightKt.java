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
import defpackage.bv;
import defpackage.er;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatAlignRightKt {
    private static ImageVector _formatAlignRight;

    public static final ImageVector getFormatAlignRight(Icons.Filled filled) {
        ImageVector imageVector = _formatAlignRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FormatAlignRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(3.0f, 21.0f, 18.0f, -2.0f);
        bv.r(b, 3.0f, 19.0f, 2.0f);
        k4.C(b, 9.0f, 17.0f, 12.0f, -2.0f);
        bv.r(b, 9.0f, 15.0f, 2.0f);
        k4.C(b, 3.0f, 13.0f, 18.0f, -2.0f);
        bv.r(b, 3.0f, 11.0f, 2.0f);
        b.moveTo(9.0f, 9.0f);
        b.horizontalLineToRelative(12.0f);
        b.lineTo(21.0f, 7.0f);
        bv.r(b, 9.0f, 7.0f, 2.0f);
        bv.y(b, 3.0f, 3.0f, 2.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 21.0f, 3.0f, 3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatAlignRight = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFormatAlignRight$annotations(Icons.Filled filled) {
    }
}
