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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditOffKt {
    private static ImageVector _editOff;

    public static final ImageVector getEditOff(Icons.Sharp sharp) {
        ImageVector imageVector = _editOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EditOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.41f, 6.33f, -3.75f, -3.75f);
        e.lineToRelative(-2.53f, 2.54f);
        gy.B(e, 3.75f, 3.75f, 21.41f, 6.33f);
        e.moveTo(1.39f, 4.22f);
        e.lineToRelative(7.32f, 7.32f);
        fc.t(e, 3.0f, 17.25f, 21.0f, 3.75f);
        e.lineToRelative(5.71f, -5.71f);
        e.lineToRelative(7.32f, 7.32f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 2.81f, 2.81f, 1.39f, 4.22f);
        e.moveTo(17.81f, 9.94f);
        e.lineToRelative(-3.75f, -3.75f);
        e.lineToRelative(-2.52f, 2.52f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 3.75f, 3.75f, 17.81f, 9.94f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editOff = build;
        build.getClass();
        return build;
    }
}
