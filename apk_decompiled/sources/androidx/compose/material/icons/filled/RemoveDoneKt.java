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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveDoneKt {
    private static ImageVector _removeDone;

    public static final ImageVector getRemoveDone(Icons.Filled filled) {
        ImageVector imageVector = _removeDone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RemoveDone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(1.79f, 12.0f, 5.58f, 5.59f);
        e.lineTo(5.96f, 19.0f);
        r6.C(e, 0.37f, 13.41f, 1.79f, 12.0f);
        e.moveTo(2.24f, 4.22f);
        e.lineTo(12.9f, 14.89f);
        e.lineToRelative(-1.28f, 1.28f);
        e.lineTo(7.44f, 12.0f);
        e.lineToRelative(-1.41f, 1.41f);
        e.lineTo(11.62f, 19.0f);
        e.lineToRelative(2.69f, -2.69f);
        e.lineToRelative(4.89f, 4.89f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 3.65f, 2.81f, 2.24f, 4.22f);
        e.moveTo(17.14f, 13.49f);
        e.lineTo(23.62f, 7.0f);
        e.lineTo(22.2f, 5.59f);
        fc.C(e, -6.48f, 6.48f, 1.42f, 1.42f);
        e.moveTo(17.96f, 7.0f);
        e.lineToRelative(-1.41f, -1.41f);
        e.lineToRelative(-3.65f, 3.66f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.41f, 1.41f, 17.96f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeDone = build;
        build.getClass();
        return build;
    }
}
