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
import defpackage.er;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LabelImportantKt {
    private static ImageVector _labelImportant;

    public static final ImageVector getLabelImportant(Icons.Filled filled) {
        ImageVector imageVector = _labelImportant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LabelImportant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.5f, 18.99f, 11.0f, 0.01f);
        e.curveToRelative(0.67f, 0.0f, 1.27f, -0.33f, 1.63f, -0.84f);
        e.lineTo(20.5f, 12.0f);
        e.lineToRelative(-4.37f, -6.16f);
        e.curveToRelative(-0.36f, -0.51f, -0.96f, -0.84f, -1.63f, -0.84f);
        e.lineToRelative(-11.0f, 0.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 8.34f, 12.0f, 3.5f, 18.99f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _labelImportant = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getLabelImportant$annotations(Icons.Filled filled) {
    }
}
