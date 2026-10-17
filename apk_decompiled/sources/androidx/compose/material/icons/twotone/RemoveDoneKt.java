package androidx.compose.material.icons.twotone;

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
public final class RemoveDoneKt {
    private static ImageVector _removeDone;

    public static final ImageVector getRemoveDone(Icons.TwoTone twoTone) {
        ImageVector imageVector = _removeDone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RemoveDone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(4.84f, 1.98f, 3.43f, 3.39f);
        i.lineToRelative(10.38f, 10.38f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineToRelative(-4.24f, -4.24f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineToRelative(5.66f, 5.66f);
        i.lineToRelative(2.83f, -2.83f);
        i.lineToRelative(6.6f, 6.6f);
        gy.B(i, 1.41f, -1.41f, 4.84f, 1.98f);
        i.moveTo(18.05f, 12.36f);
        i.lineTo(23.0f, 7.4f);
        i.lineTo(21.57f, 6.0f);
        gy.B(i, -4.94f, 4.94f, 18.05f, 12.36f);
        i.moveTo(17.34f, 7.4f);
        i.lineToRelative(-1.41f, -1.41f);
        i.lineToRelative(-2.12f, 2.12f);
        gy.B(i, 1.41f, 1.41f, 17.34f, 7.4f);
        i.moveTo(1.08f, 12.35f);
        i.lineToRelative(5.66f, 5.66f);
        i.lineToRelative(1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, -5.66f, -5.66f, 1.08f, 12.35f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeDone = build;
        build.getClass();
        return build;
    }
}
