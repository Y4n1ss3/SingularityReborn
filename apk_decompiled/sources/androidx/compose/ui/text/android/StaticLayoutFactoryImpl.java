package androidx.compose.ui.text.android;

import android.text.StaticLayout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
interface StaticLayoutFactoryImpl {
    StaticLayout create(StaticLayoutParams staticLayoutParams);

    boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z);
}
