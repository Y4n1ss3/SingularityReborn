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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditOffKt {
    private static ImageVector _editOff;

    public static final ImageVector getEditOff(Icons.Filled filled) {
        ImageVector imageVector = _editOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EditOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.126f, 8.125f, 1.937f, -1.937f);
        fc.C(e, 3.747f, 3.747f, -1.937f, 1.938f);
        e.moveTo(20.71f, 5.63f);
        e.lineToRelative(-2.34f, -2.34f);
        e.arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f);
        e.lineToRelative(-1.83f, 1.83f);
        e.lineToRelative(3.75f, 3.75f);
        e.lineTo(20.71f, 7.0f);
        e.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.37f);
        k4.x(e, 2.0f, 5.0f, 6.63f, 6.63f);
        fc.t(e, 3.0f, 17.25f, 21.0f, 3.75f);
        e.lineToRelative(5.63f, -5.62f);
        e.lineTo(18.0f, 21.0f);
        e.lineToRelative(2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 4.0f, 3.0f, 2.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editOff = build;
        build.getClass();
        return build;
    }
}
